package com.knoldus

object Equality extends App {
  val firstList = List(5, 3, 7, 2, 8, 9)
  val secondList = List(5, 3, 7, 2, 8, 9)
  val secondSeq = Seq(5, 3, 7, 2, 8, 9)
  val thirdList = firstList

  println(firstList.equals(secondSeq))
  println(firstList == secondSeq)
  println(firstList eq secondSeq)
  println(firstList ne secondSeq)

  println(firstList == secondList)
  println(firstList eq secondList)
  println(firstList.equals(secondList))

  println(firstList == thirdList)
  println(firstList eq thirdList)
  println(firstList.equals(thirdList))

}
