package com.knoldus
import scala.math.BigDecimal.double2bigDecimal
////object fibonacciSeries extends App {
////
////
////}
//
//object Fibonacci {
//  def main(args: Array[String]): Unit = {
//    val n = 10 // set the number of Fibonacci numbers to generate
//    val fibSeq = fibonacciSeq(n) // generate the Fibonacci sequence
//    println(fibSeq) // print the sequence as a comma-separated string
//  }
//
//  private def fibonacciSeq(n: Int): Seq[Int] = {
//    if (n <= 0) {
//      Seq()
//    } else if (n == 1) {
//      Seq(0)
//    } else if (n == 2) {
//      Seq(0, 1)
//    } else {
//      val prevSeq = fibonacciSeq(n - 1) // generate the previous Fibonacci sequence
//      prevSeq :+ (prevSeq.takeRight(2).sum) // add the next number to the sequence
//    }
//  }
//}
//
object Main extends App{
//private def execute(operands: Seq[Double]): Unit = {
//  val sequenceOfFactorials = operands.map(value => findFactorial(value))
//  val valueSix = 6
//  val powerOfSix = for {
//    value <- operands
//  } yield valueSix.pow(value.toInt)
//
//  def findPower(value: Double): BigDecimal = {
//    valueSix.pow(value.toInt)
//  }
//  val result = operands.filter(value => findPower(value) > findFactorial(value))
//  println(result)
//  println(sequenceOfFactorials)
//  println(powerOfSix)
//  if (result) "/Equal"
//  else "Not Equal"

  //    val sequenceOfFactorials = operands.map(value => findFactorial(value)) 218

//  val powerOfSix = for {
//    value <- operands
//  } yield valueSix.pow(value.toInt)

//def findFactorial(value: Do

  private def findFibonacci(number: Double, firstNumber: Double = 0, secondNumber: Double = 1): Double = {
    if (number == 1) 0.0
    else if(number <= 2) secondNumber
    else findFibonacci(number - 1, secondNumber, secondNumber + firstNumber)
  }

  println(findFibonacci(1))
  println(findFibonacci(2))
  println(findFibonacci(3))
  println(findFibonacci(4))
  println(findFibonacci(5))
  println(findFibonacci(6))
  println(findFibonacci(7))
  println(findFibonacci(8))
  println(findFibonacci(9))
  println(findFibonacci(10))
}