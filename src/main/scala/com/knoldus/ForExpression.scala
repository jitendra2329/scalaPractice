package com.knoldus

import scala.util.Try

object ForExpression extends App {
  private val firstNumber = Try(45.0 / 8)
  private val secondNumber = Try(80.0 / 7)
  private val thirdNumber = Try(20.0 / 5)
  private val fourthNumber = Try(40 / 2)

  val result = for {
    num1 <- firstNumber
    num2 <- secondNumber
    num3 <- thirdNumber
    num4 <- fourthNumber
  } yield (num1 + num2) - (num3 + num4)

  val result2 = for {
    num <- fourthNumber
  } yield {
    if (num % 2 == 0) num + 2
  }

  val list = List(2, 56, 8, 4, 3, 7, 9)

  val result3 = for {
    nm <- list
  } yield {
    if (nm % 2 == 0) nm * 0
    else nm
  }

  println(result)
  println(result2)
  println(result3)
}
