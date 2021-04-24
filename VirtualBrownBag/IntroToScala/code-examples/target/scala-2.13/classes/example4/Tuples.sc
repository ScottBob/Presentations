def multiply(x: Int, y: Int): (String, Int) = {
  (s"$x * $y = ", x * y)
}

val (m, r) = multiply(2, 3)
println(m + r.toString)
