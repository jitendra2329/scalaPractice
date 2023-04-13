package multithreading

import java.util.concurrent.locks.ReentrantLock

object Threads extends App {

  private val lock = new ReentrantLock()

  private val firstValue = 24
  private val secondValue = 34
  lock.lock()
  private def addValues = synchronized {
    println(firstValue + secondValue)
  }
  try{
    addValues
  }finally {
    lock.unlock()
  }
}
