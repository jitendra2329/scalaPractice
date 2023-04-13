package com.knoldus



import scala.io.StdIn._
import scala.util.{Try,Success,Failure}


object UserInputCheck extends App{

  val number = Try(readInt)
  number match {
    case Success(value)=> println(value)
    case Failure(exception) => exception.getCause
  }

}
