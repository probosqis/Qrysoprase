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

import kotlin.collections.listOf
import kotlin.test.Test
import kotlin.test.assertEquals

class DispatcherTest {
   @Test
   fun dispatch() {
      data class EventImpl(val i: Int) : Event

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      dispatcher { EventImpl(1)  }
      dispatcher { EventImpl(1)  }
      dispatcher { EventImpl(2)  }
      dispatcher { EventImpl(3)  }
      dispatcher { EventImpl(5)  }
      dispatcher { EventImpl(8)  }
      dispatcher { EventImpl(13) }

      assertEquals(
         listOf(1, 1, 2, 3, 5, 8, 13),
         receivedEvents.map { it.i }
      )
   }

   @Test
   fun dispatch_subtypeEvent() {
      abstract class EventImpl : Event
      data class EventA(val i: Int) : EventImpl()
      data class EventB(val s: String) : EventImpl()

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      dispatcher { EventA(0) }

      val subtypeDispatcher: Dispatcher<() -> EventB> = dispatcher
      subtypeDispatcher { EventB("1") }

      assertEquals(
         listOf(EventA(0), EventB("1")),
         receivedEvents
      )
   }

   @Test
   fun dispatch_withArg() {
      data class EventImpl(val i: Int) : Event

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      dispatcher(::EventImpl, 1)
      dispatcher(::EventImpl, 1)
      dispatcher(::EventImpl, 2)
      dispatcher(::EventImpl, 3)
      dispatcher(::EventImpl, 5)
      dispatcher(::EventImpl, 8)
      dispatcher(::EventImpl, 13)

      assertEquals(
         listOf(1, 1, 2, 3, 5, 8, 13),
         receivedEvents.map { it.i }
      )
   }

   @Test
   fun dispatch_with20Args() {
      data class EventImpl(
         val param1: Int,
         val param2: Int,
         val param3: String,
         val param4: String,
         val param5: Int,
         val param6: String,
         val param7: String,
         val param8: String,
         val param9: String,
         val param10: Int,
         val param11: Unit,
         val param12: Int,
         val param13: String,
         val param14: String,
         val param15: Int,
         val param16: Int,
         val param17: Int,
         val param18: Int,
         val param19: Int,
         val param20: String
      ) : Event

      var receivedEvent: EventImpl? = null

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvent = event
      }

      val dispatcher10 = dispatcher.addContextualEventArgs(1, 2, "3", "4", 5, "6", "7", "8", "9", 10)

      dispatcher10(::EventImpl, Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20")

      assertEquals(
         EventImpl(1, 2, "3", "4", 5, "6", "7", "8", "9", 10, Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20"),
         receivedEvent
      )
   }

   @Test
   fun contextualEventArgs_addContextualEventArgs() {
      data class EventImpl(val i: Int) : Event

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      val childDispatcher0 = dispatcher.addContextualEventArgs(0)
      childDispatcher0(::EventImpl)

      val childDispatcher1 = dispatcher.addContextualEventArgs(1)
      childDispatcher1(::EventImpl)

      assertEquals(
         listOf(0, 1),
         receivedEvents.map { it.i }
      )
   }

   @Test
   fun contextualEventArgs_add20ContextualEventArgs() {
      data class EventImpl(
         val param1: Int,
         val param2: Int,
         val param3: String,
         val param4: String,
         val param5: Int,
         val param6: String,
         val param7: String,
         val param8: String,
         val param9: String,
         val param10: Int,
         val param11: Unit,
         val param12: Int,
         val param13: String,
         val param14: String,
         val param15: Int,
         val param16: Int,
         val param17: Int,
         val param18: Int,
         val param19: Int,
         val param20: String
      ) : Event

      var receivedEvent: EventImpl? = null

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvent = event
      }

      val dispatcher10 = dispatcher.addContextualEventArgs(1, 2, "3", "4", 5, "6", "7", "8", "9", 10)
      val dispatcher20 = dispatcher10.addContextualEventArgs(Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20")

      dispatcher20(::EventImpl)

      assertEquals(
         EventImpl(1, 2, "3", "4", 5, "6", "7", "8", "9", 10, Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20"),
         receivedEvent
      )
   }

   @Test
   fun contextualEventArgs_contextualEventArgsBlock() {
      data class EventImpl(val i: Int) : Event

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      context(dispatcher: Dispatcher<(Int) -> EventImpl>)
      fun dispatchEventImpl() {
         dispatcher(::EventImpl)
      }

      context(dispatcher) {
         contextualEventArgs(0) {
            dispatchEventImpl()
         }

         contextualEventArgs(1) {
            dispatchEventImpl()
         }
      }

      assertEquals(
         listOf(0, 1),
         receivedEvents.map { it.i }
      )
   }

   @Test
   fun contextualEventArgs_20ContextualEventArgsBlock() {
      data class EventImpl(
         val param1: Int,
         val param2: Int,
         val param3: String,
         val param4: String,
         val param5: Int,
         val param6: String,
         val param7: String,
         val param8: String,
         val param9: String,
         val param10: Int,
         val param11: Unit,
         val param12: Int,
         val param13: String,
         val param14: String,
         val param15: Int,
         val param16: Int,
         val param17: Int,
         val param18: Int,
         val param19: Int,
         val param20: String
      ) : Event

      var receivedEvent: EventImpl? = null

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvent = event
      }

      context(dispatcher: Dispatcher<(Int, Int, String, String, Int, String, String, String, String, Int, Unit, Int, String, String, Int, Int, Int, Int, Int, String) -> EventImpl>)
      fun dispatchEventImpl() {
         dispatcher(::EventImpl)
      }

      context(dispatcher: Dispatcher<(Int, Int, String, String, Int, String, String, String, String, Int) -> EventImpl>)
      fun dispatchEventIntermediate() {
         contextualEventArgs(Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20") {
            dispatchEventImpl()
         }
      }

      context(dispatcher) {
         contextualEventArgs(1, 2, "3", "4", 5, "6", "7", "8", "9", 10) {
            dispatchEventIntermediate()
         }
      }

      assertEquals(
         EventImpl(1, 2, "3", "4", 5, "6", "7", "8", "9", 10, Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20"),
         receivedEvent
      )
   }

   @Test
   fun contextualEventArgs_contextualEventArgsExtensionFunction() {
      data class EventImpl(val i: Int) : Event

      val receivedEvents = mutableListOf<EventImpl>()

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvents += event
      }

      context(dispatcher: Dispatcher<(Int) -> EventImpl>)
      fun dispatchEventImpl() {
         dispatcher(::EventImpl)
      }

      dispatcher.contextualEventArgs(0) {
         dispatchEventImpl()
      }

      dispatcher.contextualEventArgs(1) {
         dispatchEventImpl()
      }

      assertEquals(
         listOf(0, 1),
         receivedEvents.map { it.i }
      )
   }

   @Test
   fun contextualEventArgs_20contextualEventArgsExtensionFunction() {
      data class EventImpl(
         val param1: Int,
         val param2: Int,
         val param3: String,
         val param4: String,
         val param5: Int,
         val param6: String,
         val param7: String,
         val param8: String,
         val param9: String,
         val param10: Int,
         val param11: Unit,
         val param12: Int,
         val param13: String,
         val param14: String,
         val param15: Int,
         val param16: Int,
         val param17: Int,
         val param18: Int,
         val param19: Int,
         val param20: String
      ) : Event

      var receivedEvent: EventImpl? = null

      val dispatcher = Dispatcher { event: EventImpl ->
         receivedEvent = event
      }

      context(dispatcher: Dispatcher<(Int, Int, String, String, Int, String, String, String, String, Int, Unit, Int, String, String, Int, Int, Int, Int, Int, String) -> EventImpl>)
      fun dispatchEventImpl() {
         dispatcher(::EventImpl)
      }

      context(dispatcher: Dispatcher<(Int, Int, String, String, Int, String, String, String, String, Int) -> EventImpl>)
      fun dispatchEventIntermediate() {
         dispatcher.contextualEventArgs(Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20") {
            dispatchEventImpl()
         }
      }

      dispatcher.contextualEventArgs(1, 2, "3", "4", 5, "6", "7", "8", "9", 10) {
         dispatchEventIntermediate()
      }

      assertEquals(
         EventImpl(1, 2, "3", "4", 5, "6", "7", "8", "9", 10, Unit, 12, "13", "14", 15, 16, 17, 18, 19, "20"),
         receivedEvent
      )
   }

   @Test
   fun contextualEventArgs_variousEventTypes() {
      data class IntEvent(val i: Int) : Event
      data class StringEvent(val s: String) : Event

      val receivedIntEvents    = mutableListOf<IntEvent>()
      val receivedStringEvents = mutableListOf<StringEvent>()

      val intDispatcher = Dispatcher { event: IntEvent ->
         receivedIntEvents += event
      }

      val stringDispatcher = Dispatcher { event: StringEvent ->
         receivedStringEvents += event
      }

      context(dispatcher: Dispatcher<(Int) -> IntEvent>)
      fun dispatchIntEvent() {
         dispatcher(::IntEvent)
      }

      context(dispatcher: Dispatcher<(String) -> StringEvent>)
      fun dispatchStringEvent() {
         dispatcher(::StringEvent)
      }

      intDispatcher.contextualEventArgs(0) {
         dispatchIntEvent()
      }

      stringDispatcher.contextualEventArgs("0") {
         dispatchStringEvent()
      }

      assertEquals(listOf(IntEvent   (0)),   receivedIntEvents)
      assertEquals(listOf(StringEvent("0")), receivedStringEvents)
   }
}
