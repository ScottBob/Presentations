case class Item(id: Int, description: String)

val i1 = Item(1, "Item1")
val i2 = Item(1, "Item1")
val result = i1.equals(i2)
println(result)
