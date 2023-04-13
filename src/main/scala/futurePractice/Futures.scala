package futurePractice

import scala.actors.threadpool.Future
import scala.io.Source

object Futures extends App{
  val fileName =  "src/main/resources/grades.csv"

//  for(line <- Source.fromFile(fileName).getLines()){
//    val cols = line.split(",").toList
//    println(cols(0)(0)+" | "+cols(1))
////    println(line)
//  }

  val lines = Source.fromFile(fileName).getLines().toList
  println(lines(0))
  println(lines.size)
  val heads = lines.head.split(",").toList
//  println(heads)
  val tails = lines.tail.map(_.split(",").toList)
//  println(tails)

  val temp =heads.zip(tails(0))
//  println(temp)
//  println(temp.toMap)


  val result = tails.map(value=>heads.zip(value).toMap)
  println(result)
  val ids = result.map(value => value("StudentID"))
  println(ids)
//  def parseCSV(file: String): Future[List[Map[String, String]]] = {
//    var data = Map[String,String]
//
//  }
}
