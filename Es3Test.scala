package u02

import org.junit.jupiter.api.Test
import u02.BTrees.Tree.*
import u02.Es3.{Tup2, genericEquals}

class Es3Test {

  @Test def testGenericsEquals(): Unit = {
    assertEquals(true, genericEquals(Tup2("Hello Scala!"), Tup2("Hello Scala!")))
    assertEquals(false, genericEquals(Tup2(7), Tup2(8)))
  }

}
