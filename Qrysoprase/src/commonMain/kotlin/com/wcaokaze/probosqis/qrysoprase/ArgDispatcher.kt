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

context(parent: Dispatcher<() -> E>)
inline fun <E : Event, R, C1> contextualEventArgs(
   context1: C1,
   block: context(Dispatcher<(C1) -> E>) () -> R
): R {
   return context(parent.addContextualEventArgs(context1)) {
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
