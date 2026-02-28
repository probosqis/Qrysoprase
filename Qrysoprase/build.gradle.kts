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

tasks.register<
    com.wcaokaze.probosqis.qrysoprase.buildscript.GenerateEventArgUtils
>("generateEventArgUtils") {
   kotlin.sourceSets.commonMain {
      kotlin.srcDir(outputDir)
   }
}

tasks.configureEach {
   if (name.contains("compile") && name.contains("Kotlin")) {
      dependsOn("generateEventArgUtils")
   }
}
