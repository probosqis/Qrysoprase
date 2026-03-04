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

package com.wcaokaze.probosqis.qrysoprase.buildscript

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import java.io.File

open class GenerateEventArgUtils : DefaultTask() {
   @get:OutputDirectory
   val outputDir = project.layout.buildDirectory.file("generated/src").get().asFile

   @TaskAction
   fun generateUtils() {
      val packageName = "com.wcaokaze.probosqis.qrysoprase"
      val packageDir = File(outputDir, packageName.replace(".", File.separator))

      createPackageDir(packageDir)
      generateAddContextualEventArgs(packageDir, packageName)
      generateDispatchWithArgs(packageDir, packageName)
      generateContextualEventArgs(packageDir, packageName)
      generateContextualEventArgsExtension(packageDir, packageName)
   }

   private fun createPackageDir(packageDir: File) {
      if (!packageDir.exists() && !packageDir.mkdirs()) {
         throw GradleException("can not generate source dir: $packageDir")
      }
   }

   private fun generateAddContextualEventArgs(
      packageDir: File,
      packageName: String
   ) {
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
   }

   private fun generateDispatchWithArgs(packageDir: File, packageName: String) {
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
   }

   private fun generateContextualEventArgs(packageDir: File, packageName: String) {
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
   }

   private fun generateContextualEventArgsExtension(
      packageDir: File,
      packageName: String
   ) {
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

   private operator fun IntRange.invoke(
      separator: String = ", ",
      mapper: (Int) -> String
   ) = joinToString(separator) { mapper(it) }
}
