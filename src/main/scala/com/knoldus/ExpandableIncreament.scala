package com.knoldus

object ExpandableIncreament extends App{
  def increamentValue(number: Int, increamentBy: Int) = number + increamentBy

  println(increamentValue(2,1))
  println(increamentValue(2,2))
  println(increamentValue(2,3))
}
