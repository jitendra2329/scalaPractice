//package com.knoldus
//
//case class Number(number: String, isEven: Boolean)
//
//class NumberDriver {
//    val firstObject = Number("1", isEven = false)
//    val secondObject = Number("2", isEven = true)
//    val thirdObject = Number("3", isEven = false)
//    val fourthObject = Number("4", isEven = true)
//    val fifthObject = Number("5", isEven = false)
//
//    val numbers: List[Number] = List(firstObject, secondObject, thirdObject, fourthObject, fifthObject)
//
//  def getEvenValues() {
//    val evenValuesOfList = numbers.filter(_.isEven)
//    evenValuesOfList.map(_.number)
//  }
////  println("list of even fields of the case class : " + evenNumbersOfList)
//
//  def getOddvalues() {
//    val oddValuesOfList = numbers.filterNot(_.isEven)
//    oddValuesOfList.map(_.number)
//  }
//  println("list of odd fields of the case class : " + oddNumbersOfList)
//
//  def partitions(): (List[Number], List[Number]) = {
//    numbers.partition(_.isEven)
//  }
//
//  println("partition of the list of case class : " + partitions)
//
//    val listOfNumbers = List(5, 8, 3, 10, 5, 11)
//  println("even numbers of List[Int] : " + listOfNumbers.filter(_ % 2 == 0))
//  println("even numbers of List[Int] : " + listOfNumbers.filter(_ % 2 != 0))
//}
