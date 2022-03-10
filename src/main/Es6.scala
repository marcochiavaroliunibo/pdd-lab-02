package main

object Es6 extends App:

  /* Point 6 - Fibonacci */
  
  def fib (n: Int) : Int = n match
    case 0 => 0
    case 1 => 1
    case n => fib(n-1) + fib(n-2)