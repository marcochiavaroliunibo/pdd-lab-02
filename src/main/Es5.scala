package main

object Es5 extends App:

  /* Point 5 - Compose */
  def compose (f: Int => Int, g: Int => Int)(n: Int) : Int = f(g(n))

  /* Compose generic version */
  def composeGenerics[A] (f: A => A, g: A => A)(n: A) : A = f(g(n))