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

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember

@Stable
abstract class Dispatcher<in C : Function<Event>>
   internal constructor()
{
   abstract operator fun invoke(eventConstructor: C)
}

private inline fun <C : Function<Event>> Dispatcher(
   crossinline dispatcher: (eventConstructor: C) -> Unit
): Dispatcher<C> {
   return object : Dispatcher<C>() {
      override fun invoke(eventConstructor: C) {
         dispatcher(eventConstructor)
      }
   }
}

/**
 * イベント受信時に指定された[listener]を実行するDispatcherを作成する。
 *
 * ```
 * val dispatcher = Dispatcher { event: YourEventType ->
 *    when (event) {
 *       is YourEventA -> {
 *       }
 *       is YourEventB -> {
 *       }
 *    }
 * }
 * ```
 *
 * ## Tips
 * この関数の呼び出し自体に実型引数を明示せず、他の手段で型を推論させると
 * 可読性が高い。
 *
 * ❌
 * ```
 * val dispatcher = Dispatcher<YourEventType, () -> YourEventType> { event ->
 * }
 * ```
 *
 * ⭕
 * ```
 * val dispatcher: Dispatcher<() -> YourEventType> = Dispatcher { event ->
 * }
 * ```
 *
 * ⭕
 * ```
 * val dispatcher = Dispatcher { event: YourEventType ->
 * }
 * ```
 */
fun <E : Event, C : () -> E> Dispatcher(
   listener: EventListener<E>
) = Dispatcher<C> { eventConstructor ->
   val event = eventConstructor()
   listener.onEvent(event)
}

/**
 * イベント受信時に指定された[listener]を実行するDispatcherを作成し、
 * rememberする。
 *
 * ```
 * val dispatcher = rememberDispatcher { event: YourEventType ->
 *    when (event) {
 *       is YourEventA -> {
 *       }
 *       is YourEventB -> {
 *       }
 *    }
 * }
 * ```
 *
 * ## Tips
 * この関数の呼び出し自体に実型引数を明示せず、他の手段で型を推論させると
 * 可読性が高い。
 *
 * ❌
 * ```
 * val dispatcher = rememberDispatcher<YourEventType, () -> YourEventType> { event ->
 * }
 * ```
 *
 * ⭕
 * ```
 * val dispatcher: Dispatcher<() -> YourEventType> = rememberDispatcher { event ->
 * }
 * ```
 *
 * ⭕
 * ```
 * val dispatcher = rememberDispatcher { event: YourEventType ->
 * }
 * ```
 */
@Composable
fun <E : Event, C : () -> E> rememberDispatcher(
   listener: EventListener<E>
): Dispatcher<C> {
   return remember(listener) {
      Dispatcher(listener)
   }
}

operator fun <E : Event, A1> Dispatcher<() -> E>.invoke(
   eventConstructor: (A1) -> E,
   arg1: A1
) {
   val constructor = fun (): E {
      return eventConstructor(arg1)
   }

   invoke(constructor)
}
