import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.util.{Failure, Success}

def longOperation(): Unit = {
  val future: Future[String] = Future {
//    Thread.sleep(5000)
    "result"
  }

  future.onComplete {
    case Success(result) => println(result)
    case Failure(throwable) => println("Something went wrong: " + throwable.getMessage)
  }
}

longOperation()
