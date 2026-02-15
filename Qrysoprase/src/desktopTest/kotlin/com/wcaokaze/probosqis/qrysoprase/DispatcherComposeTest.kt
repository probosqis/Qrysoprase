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

package com.wcaokaze.probosqis.qrysoprase

import androidx.compose.material3.Text
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotSame
import kotlin.test.assertSame

class DispatcherComposeTest {
   @get:Rule
   val rule = createComposeRule()

   @Test
   fun rememberDispatcher_noCapture_remembered() {
      class EventImpl : Event

      lateinit var dispatcher: Dispatcher<EventImpl>

      var recompositionTrigger by mutableIntStateOf(0)
      var compositionCount by mutableIntStateOf(0)

      rule.setContent {
         SideEffect { compositionCount++ }

         // 何もキャプチャしないラムダ式。
         // Kotlinコンパイラの最適化によってシングルトンになり、
         // リコンポジションも同一インスタンスが使われる
         dispatcher = rememberDispatcher {}

         Text("$recompositionTrigger")
      }

      val firstDispatcher = rule.runOnIdle { dispatcher }

      recompositionTrigger++

      rule.runOnIdle {
         val secondDispatcher = dispatcher

         assertEquals(2, compositionCount)
         assertSame(firstDispatcher, secondDispatcher)
      }
   }

   @Test
   fun rememberDispatcher_captured_recreated() {
      class EventImpl : Event

      lateinit var dispatcher: Dispatcher<EventImpl>

      var recompositionTrigger by mutableIntStateOf(0)
      var compositionCount by mutableIntStateOf(0)
      var capturedValue = 0

      rule.setContent {
         SideEffect { compositionCount++ }

         // 値をキャプチャする。
         // このラムダ式はリコンポジションのたびにインスタンス化され、
         // 別のインスタンスとなる
         dispatcher = rememberDispatcher { capturedValue }

         Text("$recompositionTrigger")
      }

      val firstDispatcher = rule.runOnIdle { dispatcher }

      capturedValue++
      recompositionTrigger++

      rule.runOnIdle {
         val secondDispatcher = dispatcher

         assertEquals(2, compositionCount)
         assertNotSame(firstDispatcher, secondDispatcher)
      }
   }

   @Test
   fun rememberDispatcher_capturedButValueNotChanged_intrinsicRemember() {
      class EventImpl : Event

      lateinit var dispatcher: Dispatcher<EventImpl>

      var recompositionTrigger by mutableIntStateOf(0)
      var compositionCount by mutableIntStateOf(0)
      val capturedValue = 0

      rule.setContent {
         SideEffect { compositionCount++ }

         // 値をキャプチャするが、その値が変化しない。
         // IntrinsicRememberにより前コンポジションと同じインスタンスが使われる
         dispatcher = rememberDispatcher { capturedValue }

         Text("$recompositionTrigger")
      }

      val firstDispatcher = rule.runOnIdle { dispatcher }

      recompositionTrigger++

      rule.runOnIdle {
         val secondDispatcher = dispatcher

         assertEquals(2, compositionCount)
         assertSame(firstDispatcher, secondDispatcher)
      }
   }

   @Test
   fun rememberDispatcher_capturedButState_intrinsicRemember() {
      class EventImpl : Event

      lateinit var dispatcher: Dispatcher<EventImpl>

      var recompositionTrigger by mutableIntStateOf(0)
      var compositionCount by mutableIntStateOf(0)
      var capturedValue by mutableIntStateOf(0)

      rule.setContent {
         SideEffect { compositionCount++ }

         // capturedValueの値をキャプチャしているように見えるが
         // 実際にキャプチャしているのはbyで委譲しているMutableStateの
         // インスタンスであり、リコンポジション後もMutableStateの
         // インスタンス自体は変化しないのでIntrinsicRememberにより
         // ラムダ式は前コンポジションと同じインスタンスが使われる
         dispatcher = rememberDispatcher { capturedValue }

         Text("$recompositionTrigger")
      }

      val firstDispatcher = rule.runOnIdle { dispatcher }

      capturedValue++
      recompositionTrigger++

      rule.runOnIdle {
         val secondDispatcher = dispatcher

         assertEquals(2, compositionCount)
         assertSame(firstDispatcher, secondDispatcher)
      }
   }
}
