import scala.annotation.tailrec

def factorial(x: Long): Long = {
  if (x == 0 || x == 1) 1
  else x * factorial(x - 1)
}

@tailrec
def factorialTail(x: Long, acc: Long): Long = {
  if (x == 0 || x == 1) acc
  else factorialTail(x - 1, x * acc)
}

println(factorial(5))

println(factorialTail(5, 1))
