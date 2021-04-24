case class Pair[K, V](key: K, value: V)

def doOperation[T](x: T, y: T, operation: (T, T) => T): T = {
  operation(x, y)
}

doOperation[Int](2, 3, (x, y) => x + y)
