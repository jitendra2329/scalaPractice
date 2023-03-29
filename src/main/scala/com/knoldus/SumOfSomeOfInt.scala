package com.knoldus

object SumOfSomeOfInt extends App {
  def operation(firstNumber: Some[Int], secondNumber: Some[Int], thirdNumber: Some[Int]): Option[Int] = {
    //    val firstValue = firstNumber.map(value => value).getOrElse(0)
    //    val secondValue = secondNumber.map(value => value).getOrElse(0)
    //    val thirdValue = thirdNumber.map(value => value).getOrElse(0)

    //    firstValue + secondValue + thirdValue

    //    val result = firstNumber.flatMap { num1 =>
    //        secondNumber.flatMap { num2 =>
    //          thirdNumber.map { num3 =>
    //            num1 + num2 + num3
    //          }
    //        }
    //    }

    val result = for {
      num1 <- firstNumber
      num2 <- secondNumber
      num3 <- thirdNumber
    } yield num1 + num2 + num3

    result
  }

  println("sum: " + operation(Some(2), Some(5), Some(9)).getOrElse(0))
}
