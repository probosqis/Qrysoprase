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

import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
   alias(libs.plugins.kotlin.multiplatform)
   alias(libs.plugins.android.library)
   alias(libs.plugins.compose.jb)
   alias(libs.plugins.compose.compiler)
}

val generatedSrcDir = layout.buildDirectory.file("generated/src").get().asFile

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

         @OptIn(ExperimentalComposeLibrary::class)
         implementation(compose.uiTest)
      }

      androidMain.dependencies {
      }

      androidUnitTest.dependencies {
      }

      named("desktopMain").dependencies {
      }

      named("desktopTest").dependencies {
         implementation(compose.desktop.currentOs)
         implementation(compose.material3)
      }
   }
}

android {
   namespace = "com.wcaokaze.probosqis.qrysoprase"

   compileSdk = 35
}

tasks.register("generateEventArgUtils") {
   doFirst {
      val packageName = "com.wcaokaze.probosqis.qrysoprase"
      val packageDir = File(
          generatedSrcDir, packageName.replace(".", File.separator)
      )

      if (!packageDir.exists() && !packageDir.mkdirs()) {
         throw GradleException("can not generate source dir: $packageDir")
      }

      File(packageDir, "AddContextualEventArgs.kt").writeText(
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

            ${
               (1..20)
                   .map { p ->
                      (p..20).map { c ->
                         """
                            @JvmName("addContextualEventArgs${p - 1}To$c")
                            fun <E : Event, ${(1..c).map { "C$it" }.joinToString(", ")}> Dispatcher<(${(1..<p).map { "C$it" }.joinToString(", ")}) -> E>.addContextualEventArgs(
                               ${(p..c).map { "context$it: C$it" }.joinToString(", ")}
                            ): Dispatcher<(${(1..c).map { "C$it" }.joinToString(", ")}) -> E> {
                               return Dispatcher { eventConstructor ->
                                  val partialAppliedConstructor = { ${(1..<p).map { "context$it: C$it" }.joinToString(", ") } -> eventConstructor(${(1..c).map { "context$it" }.joinToString(", ")}) }
                                  this(partialAppliedConstructor)
                               }
                            }
                         """
                      }.joinToString()
                   }
                   .joinToString()
            }
         """
      )

      File(packageDir, "DispatchWithArgs.kt").writeText(
         """
            package $packageName

            ${
               (1..20)
                  .map { c ->
                     (c..20).map { a ->
                        """
                           operator fun <E : Event, ${(1..<c).map { "C$it, " }.joinToString("")}${(c..a).map { "A$it" }.joinToString(", ")}>
                              Dispatcher<(${(1..<c).map { "C$it" }.joinToString(", ")}) -> E>.invoke(
                                 eventConstructor: (${(1..<c).map { "C$it, " }.joinToString("")}${(c..a).map { "A$it" }.joinToString(", ")}) -> E,
                                 ${(c..a).map { "arg$it: A$it" }.joinToString(", ")}
                              )
                           {
                              val constructor = fun (${(1..<c).map { "context$it: C$it" }.joinToString(", ")}): E {
                                 return eventConstructor(${(1..<c).map { "context$it, " }.joinToString("")}${(c..a).map { "arg$it" }.joinToString(", ")})
                              }

                              invoke(constructor)
                           }
                        """
                     }.joinToString()
                  }
                  .joinToString()
            }
         """
      )

      File(packageDir, "ContextualEventArgs.kt").writeText(
         """
            package $packageName

            ${
               (1..20)
                  .map { p ->
                     (p..20).map { c ->
                        """
                           @JvmName("contextualEventArgs${p - 1}To$c")
                           context(parent: Dispatcher<(${(1..<p).map { "C$it" }.joinToString(", ")}) -> E>)
                           inline fun <E : Event, R, ${(1..c).map { "C$it" }.joinToString(", ")}> contextualEventArgs(
                              ${(p..c).map { "context$it: C$it" }.joinToString(", ")},
                              block: context(Dispatcher<(${(1..c).map { "C$it" }.joinToString(", ")}) -> E>) () -> R
                           ): R {
                              return context(parent.addContextualEventArgs(${(p..c).map { "context$it" }.joinToString(", ")})) {
                                 block()
                              }
                           }
                        """
                     }.joinToString()
                  }
                  .joinToString()
            }
         """
      )

      File(packageDir, "ContextualEventArgsExtension.kt").writeText(
         """
            package $packageName

            ${
               (1..20)
                  .map { p ->
                     (p..20).map { c ->
                        """
                           @JvmName("contextualEventArgsExtension${p - 1}To$c")
                           inline fun <E : Event, R, ${(1..c).map { "C$it" }.joinToString(", ")}> Dispatcher<(${(1..<p).map { "C$it" }.joinToString(", ")}) -> E>.contextualEventArgs(
                              ${(p..c).map { "context$it: C$it" }.joinToString(", ")},
                              block: context(Dispatcher<(${(1..c).map { "C$it" }.joinToString(", ")}) -> E>) () -> R
                           ): R {
                              return context(addContextualEventArgs(${(p..c).map { "context$it" }.joinToString(", ")})) {
                                 block()
                              }
                           }
                        """
                     }.joinToString()
                  }
                  .joinToString()
            }
         """
      )
   }
}

tasks.configureEach {
   if (name.contains("compileKotlin")) {
      dependsOn("generateEventArgUtils")
   }
}
