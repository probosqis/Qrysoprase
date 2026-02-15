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
}
