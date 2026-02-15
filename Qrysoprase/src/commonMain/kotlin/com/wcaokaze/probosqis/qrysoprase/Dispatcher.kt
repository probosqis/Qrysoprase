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

fun <E : Event> Dispatcher(
   listener: EventListener<E>
) = object : Dispatcher<() -> E>() {
   override fun invoke(eventConstructor: () -> E) {
      val event = eventConstructor()
      listener.onEvent(event)
   }
}

@Composable
fun <E : Event> rememberDispatcher(listener: EventListener<E>): Dispatcher<() -> E> {
   return remember(listener) {
      Dispatcher(listener)
   }
}
