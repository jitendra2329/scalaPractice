package multithreading

import scala.io.StdIn

trait Vehicle{
  def canRun: Boolean = true
}

class Car extends Vehicle  {
  def canFly = false
}
object Multithreading extends App {
  val multithreading = new Thread {
    override def run(): Unit = {
      for (i <- 10 to 1 by -1) {
        println(i)
        Thread.sleep(1000)
      }
      println("Time is up.")
      sys.exit(0)
    }
  }
  println("Enter your age. ")
  multithreading.start()
  val age = StdIn.readInt()
  if (age < 18) println("You cannot enter.")
  else println("Welcome")
  sys.exit(0)
}
