/*
 * Copyright 2026 wcaokaze
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.android.library)
   alias(libs.plugins.compose.jb)
   alias(libs.plugins.compose.compiler)
}

val generatedSrcDir = layout.buildDirectory.file("generated/src")

kotlin {
   androidTarget()
   jvm("desktop")

   jvmToolchain(17)

   compilerOptions {
      freeCompilerArgs.addAll(
         "-Xcontext-parameters",
      )
   }

   sourceSets {
      commonMain {
         kotlin.srcDir(generatedSrcDir)
      }

      commonMain.dependencies {
         implementation(compose.runtime)
      }

      commonTest.dependencies {
         implementation(libs.kotlin.test.junit)
      }

      androidMain.dependencies {
      }

      androidUnitTest.dependencies {
      }

      named("desktopMain").dependencies {
      }

      named("desktopTest").dependencies {
         implementation(compose.desktop.uiTestJUnit4)
         implementation(compose.desktop.currentOs)
         implementation(compose.material3)
      }
   }
}

android {
   namespace = "com.wcaokaze.probosqis.qrysoprase"

   compileSdk = 35
}

open class GenerateEventArgUtils : DefaultTask() {
   @get:OutputDirectory
   val generatedSrcDir = project.layout.buildDirectory.file("generated/src").get().asFile

   @TaskAction
   fun generateUtils() {
      val packageName = "com.wcaokaze.probosqis.qrysoprase"
      val packageDir = File(
         generatedSrcDir, packageName.replace(".", File.separator)
      )

      if (!packageDir.exists() && !packageDir.mkdirs()) {
         throw GradleException("can not generate source dir: $packageDir")
      }

      operator fun IntRange.invoke(separator: String = ", ", mapper: (Int) -> String)
          = joinToString(separator) { mapper(it) }

      File(packageDir, "AddContextualEventArgs.kt").writer().use { writer ->
         writer.write(
            """
               package $packageName

               private inline fun <C : Function<Event>> Dispatcher(
                  crossinline dispatcher: (eventConstructor: C) -> Unit
               ): Dispatcher<C> {
                  return object : Dispatcher<C>() {
                     override fun invoke(eventConstructor: C) {
                        dispatcher(eventConstructor)
                     }
                  }
               }
            """
         )

         for (p in 1..20) {
            for (c in p..20) {
               writer.write(
                  """
                     @JvmName("addContextualEventArgs${p - 1}To$c")
                     fun <E : Event, ${(1..c) { "C$it" }}> Dispatcher<(${(1..<p) { "C$it" }}) -> E>.addContextualEventArgs(
                        ${(p..c) { "context$it: C$it" }}
                     ): Dispatcher<(${(1..c) { "C$it" }}) -> E> {
                        return Dispatcher { eventConstructor ->
                           val partialAppliedConstructor = { ${(1..<p) { "context$it: C$it" }} -> eventConstructor(${(1..c) { "context$it" }}) }
                           this(partialAppliedConstructor)
                        }
                     }
                  """
               )
            }
         }
      }

      File(packageDir, "DispatchWithArgs.kt").writer().use { writer ->
         writer.write("package $packageName")

         for (c in 1..20) {
            for (a in c..20) {
               writer.write(
                  """
                     operator fun <E : Event, ${(1..<c)("") { "C$it, " }}${(c..a) { "A$it" }}>
                        Dispatcher<(${(1..<c) { "C$it" }}) -> E>.invoke(
                           eventConstructor: (${(1..<c)("") { "C$it, " }}${(c..a) { "A$it" }}) -> E,
                           ${(c..a) { "arg$it: A$it" }}
                        )
                     {
                        val constructor = fun (${(1..<c) { "context$it: C$it" }}): E {
                           return eventConstructor(${(1..<c)("") { "context$it, " }}${(c..a) { "arg$it" }})
                        }

                        invoke(constructor)
                     }
                  """
               )
            }
         }
      }

      File(packageDir, "ContextualEventArgs.kt").writer().use { writer ->
         writer.write("package $packageName")

         for (p in 1..20) {
            for (c in p..20) {
               writer.write(
                  """
                     @JvmName("contextualEventArgs${p - 1}To$c")
                     context(parent: Dispatcher<(${(1..<p) { "C$it" }}) -> E>)
                     inline fun <E : Event, R, ${(1..c) { "C$it" }}> contextualEventArgs(
                        ${(p..c) { "context$it: C$it" }},
                        block: context(Dispatcher<(${(1..c) { "C$it" }}) -> E>) () -> R
                     ): R {
                        return context(parent.addContextualEventArgs(${(p..c) { "context$it" }})) {
                           block()
                        }
                     }
                  """
               )
            }
         }
      }

      File(packageDir, "ContextualEventArgsExtension.kt").writer().use { writer ->
         writer.write("package $packageName")

         for (p in 1..20) {
            for (c in p..20) {
               writer.write(
                  """
                     @JvmName("contextualEventArgsExtension${p - 1}To$c")
                     inline fun <E : Event, R, ${(1..c) { "C$it" }}> Dispatcher<(${(1..<p) { "C$it" }}) -> E>.contextualEventArgs(
                        ${(p..c) { "context$it: C$it" }},
                        block: context(Dispatcher<(${(1..c) { "C$it" }}) -> E>) () -> R
                     ): R {
                        return context(addContextualEventArgs(${(p..c) { "context$it" }})) {
                           block()
                        }
                     }
                  """
               )
            }
         }
      }
   }
}

tasks.register<GenerateEventArgUtils>("generateEventArgUtils")

tasks.configureEach {
   if (name.contains("compile") && name.contains("Kotlin")) {
      dependsOn("generateEventArgUtils")
   }
}
