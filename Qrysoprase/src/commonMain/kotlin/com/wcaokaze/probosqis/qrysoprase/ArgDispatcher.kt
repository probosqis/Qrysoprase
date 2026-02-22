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

private inline fun <C : Function<Event>> Dispatcher(
   crossinline dispatcher: (eventConstructor: C) -> Unit
): Dispatcher<C> {
   return object : Dispatcher<C>() {
      override fun invoke(eventConstructor: C) {
         dispatcher(eventConstructor)
      }
   }
}

fun <E : Event, C1> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1
): Dispatcher<(C1) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2
): Dispatcher<(C1, C2) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3
): Dispatcher<(C1, C2, C3) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4
): Dispatcher<(C1, C2, C3, C4) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5
): Dispatcher<(C1, C2, C3, C4, C5) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<() -> E>.addContextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2
): Dispatcher<(C1, C2) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3
): Dispatcher<(C1, C2, C3) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4
): Dispatcher<(C1, C2, C3, C4) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5
): Dispatcher<(C1, C2, C3, C4, C5) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1) -> E>.addContextualEventArgs(
   context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3
): Dispatcher<(C1, C2, C3) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4
): Dispatcher<(C1, C2, C3, C4) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5
): Dispatcher<(C1, C2, C3, C4, C5) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2) -> E>.addContextualEventArgs(
   context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4
): Dispatcher<(C1, C2, C3, C4) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5
): Dispatcher<(C1, C2, C3, C4, C5) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3) -> E>.addContextualEventArgs(
   context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5
): Dispatcher<(C1, C2, C3, C4, C5) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4) -> E>.addContextualEventArgs(
   context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6
): Dispatcher<(C1, C2, C3, C4, C5, C6) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5) -> E>.addContextualEventArgs(
   context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>.addContextualEventArgs(
   context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>.addContextualEventArgs(
   context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>.addContextualEventArgs(
   context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>.addContextualEventArgs(
   context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>.addContextualEventArgs(
   context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>.addContextualEventArgs(
   context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>.addContextualEventArgs(
   context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>.addContextualEventArgs(
   context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15, context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15, context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15, context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15, context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>.addContextualEventArgs(
   context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>.addContextualEventArgs(
   context16: C16
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>.addContextualEventArgs(
   context16: C16, context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>.addContextualEventArgs(
   context16: C16, context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>.addContextualEventArgs(
   context16: C16, context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>.addContextualEventArgs(
   context16: C16, context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E>.addContextualEventArgs(
   context17: C17
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E>.addContextualEventArgs(
   context17: C17, context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E>.addContextualEventArgs(
   context17: C17, context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E>.addContextualEventArgs(
   context17: C17, context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E>.addContextualEventArgs(
   context18: C18
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E>.addContextualEventArgs(
   context18: C18, context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E>.addContextualEventArgs(
   context18: C18, context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E>.addContextualEventArgs(
   context19: C19
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E>.addContextualEventArgs(
   context19: C19, context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

fun <E : Event, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E>.addContextualEventArgs(
   context20: C20
): Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E> {
   return Dispatcher { eventConstructor ->
      val partialAppliedConstructor = { context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19 -> eventConstructor(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20) }
      this@addContextualEventArgs(partialAppliedConstructor)
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1> contextualEventArgs(
   context1: C1,
   block: context(Dispatcher<(C1) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2> contextualEventArgs(
   context1: C1, context2: C2,
   block: context(Dispatcher<(C1, C2) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3> contextualEventArgs(
   context1: C1, context2: C2, context3: C3,
   block: context(Dispatcher<(C1, C2, C3) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4,
   block: context(Dispatcher<(C1, C2, C3, C4) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5,
   block: context(Dispatcher<(C1, C2, C3, C4, C5) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19)) {
      block()
   }
}

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20> contextualEventArgs(
   context1: C1, context2: C2, context3: C3, context4: C4, context5: C5, context6: C6, context7: C7, context8: C8, context9: C9, context10: C10, context11: C11, context12: C12, context13: C13, context14: C14, context15: C15, context16: C16, context17: C17, context18: C18, context19: C19, context20: C20,
   block: context(Dispatcher<(C1, C2, C3, C4, C5, C6, C7, C8, C9, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, C20) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1, context2, context3, context4, context5, context6, context7, context8, context9, context10, context11, context12, context13, context14, context15, context16, context17, context18, context19, context20)) {
      block()
   }
}

@JvmName("contextualEventArgsExtension")
inline fun <E : Event, R, C1> Dispatcher<() -> E>.contextualEventArgs(
   context1: C1,
   block: context(Dispatcher<(C1) -> E>) () -> R
): R {
   return context(addContextualEventArgs(context1)) {
      block()
   }
}
