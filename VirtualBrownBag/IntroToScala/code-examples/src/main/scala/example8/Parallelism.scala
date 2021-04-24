package example8

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.util.{Failure, Success}

object Parallelism {
  def longOperation(): Unit = {
    val future: Future[String] = Future {
      // implementation of long operation
      "result"
    }

    future.onComplete {
      case Success(result) => println(result)
      case Failure(throwable) => println("Something went wrong: " + throwable.getMessage)
    }
  }

  def main(args: Array[String]): Unit = {
    longOperation()
    Thread.sleep(10000)
  }
}
