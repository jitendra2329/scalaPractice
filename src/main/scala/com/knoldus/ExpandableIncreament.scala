package com.knoldus

object ExpandableIncreament extends App {
  def increamentValue(number: Int, increamentBy: Int): Int = number + increamentBy

  println(increamentValue(2, 1))
  println(increamentValue(2, 2))
  println(increamentValue(2, 3))
  println(increamentValue(2, 4))
  println(increamentValue(2, 5))
  println(increamentValue(2, 6))
}
