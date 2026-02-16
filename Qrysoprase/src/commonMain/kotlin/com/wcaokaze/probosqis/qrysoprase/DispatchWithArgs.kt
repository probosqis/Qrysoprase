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

operator fun <E : Event, A1>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1) -> E,
      arg1: A1
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2) -> E,
      arg1: A1, arg2: A2
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3) -> E,
      arg1: A1, arg2: A2, arg3: A3
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15, arg16: A16
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15, arg16: A16, arg17: A17
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15, arg16: A16, arg17: A17, arg18: A18
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15, arg16: A16, arg17: A17, arg18: A18, arg19: A19
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19)
   }

   invoke(constructor)
}

operator fun <E : Event, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20>
    Dispatcher<() -> E>.invoke(
      eventConstructor: (A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) -> E,
      arg1: A1, arg2: A2, arg3: A3, arg4: A4, arg5: A5, arg6: A6, arg7: A7, arg8: A8, arg9: A9, arg10: A10, arg11: A11, arg12: A12, arg13: A13, arg14: A14, arg15: A15, arg16: A16, arg17: A17, arg18: A18, arg19: A19, arg20: A20
   )
{
   val constructor = fun (): E {
      return eventConstructor(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20)
   }

   invoke(constructor)
}
