package u02

object Es4 extends App:

  /* Point 4 - Currying */

  val p1: Int => Int => Int => Boolean = a => b => c => a <= b && b <= c

  val p2: (Int, Int, Int) => Boolean = (a, b, c) => a <= b && b <= c

  def p3 (a: Int)(b: Int)(c: Int): Boolean = a <= b && b <= c

  def p4 (a: Int, b: Int, c: Int): Boolean = a <= b && b <= c

  println(p1(1)(2)(3))    // True
  println(p2(1,3,2))      // False
  println(p3(1)(3)(3))    // True
  println(p4(3,2,3))      // False

