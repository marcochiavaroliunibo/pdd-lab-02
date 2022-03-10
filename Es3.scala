package u02

import Es3.{equals2, neg2}

object Es3 extends App:

  /* Point a */

  val parity: Int => String = _ match
    case n if n % 2 == 0 => "even"
    case _ => "odd"

  def parity2 (n: Int) : String = n match
    case i if i % 2 == 0 => "even"
    case _ => "odd"

  /* Point b */
  // todo: notEquals(equals) - ? -

  val neg: Boolean => Boolean = _ match
    case n if n => false
    case _ => true
  val equals: (String, String) => Boolean = _ == _

  def neg2 (n: Boolean): Boolean = n match
    case n if n => false
    case _ => true
  def equals2 (a: String, b: String): Boolean = a == b

  /* Point c */

  case class Tup2[A](a: A)
  def genericEquals[A](t1: Tup2[A], t2: Tup2[A]): Boolean = t1 == t2

