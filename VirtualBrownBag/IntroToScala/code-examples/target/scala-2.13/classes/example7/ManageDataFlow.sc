def div(x: Double, y: Double): Option[Double] = {
  if (y == 0.0) None
  else Option(x / y)
}

def sqrt(x: Double): Either[String, Double] = {
  if (Math.signum(x) < 1) Left(s"Cannot calculate square root of negative number $x")
  else Right(Math.sqrt(x))
}

def printOptionResult(x: Option[Double], onError: String): Unit = x match {
  case Some(value) => println(value)
  case None => println(onError)
}

def printEitherResult(x: Either[String, Double]): Unit = x match {
  case Left(message) => println("Error: " + message)
  case Right(value) => println(value)
}

printOptionResult(div(5.0, 2.0), "Cannot divide by zero")
printOptionResult(div(5.0, 0.0), "Cannot divide by zero")

printEitherResult(sqrt(9.0))
printEitherResult(sqrt(-1.0))
