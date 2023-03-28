package com.knoldus

import scala.io.StdIn

object ValueIncreament extends App {
  val increament = new ValueIncreament

  println(increament.valueIncreament(StdIn.readInt()))

}

class ValueIncreament {
  def valueIncreament(value: Int): Int = {
    value + 1
  }
}
