package com.knoldus

object ListPractice extends App{
  val firstList = List(5,2,9,3,1)
  val secondList = List()
  val  thirdList = List(232,343)
  def getElementFromList(list: List[Int]) = list.drop(2).dropRight(2)
  println(getElementFromList(firstList))

  println(secondList.headOption.getOrElse("list is empty!"))
  println(thirdList.headOption.getOrElse("list is empty!"))
}
