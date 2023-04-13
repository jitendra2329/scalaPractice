package multithreading

object Concurrency extends App {


  private val runnable = new Runnable {

    override def run(): Unit = {
      val threadName = Thread.currentThread().getName
      for (index <- 0 until  3)
        println(threadName)
    }


  }
  private val thread1 = new Thread(runnable)
  private val thread2 = new Thread(runnable)
  private val thread3 = new Thread(runnable)

  thread1.start()
  thread1.join()
  thread2.start()
//  thread2.join()
  thread3.start()
//  thread3.join()

}
