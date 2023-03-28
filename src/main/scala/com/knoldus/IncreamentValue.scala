package com.knoldus

import scala.io.StdIn

object IncreamentValue extends App {
  def increamentValue(value: Int): Int = value + 1

  println(increamentValue(StdIn.readInt()))
}
