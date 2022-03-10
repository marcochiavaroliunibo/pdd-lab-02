package main

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import main.Es3.{Tup2, genericEquals}

class Es3Test {

  @Test def testGenericsEquals(): Unit = {
    assertEquals(true, Es3.genericEquals(Tup2("Hello Scala!"), Tup2("Hello Scala!")))
    assertEquals(false, genericEquals(Tup2(7), Tup2(8)))
  }

}
