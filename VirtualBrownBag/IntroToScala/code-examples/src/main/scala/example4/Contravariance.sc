trait Animal {
  def name: String
}

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal

trait Printer[-T] {
  def print(value: T): Unit
}

case class AnimalPrinter() extends Printer[Animal] {
  def print(animal: Animal): Unit =
    println("The animal's name is: " + animal.name)
}

case class CatPrinter() extends Printer[Cat] {
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}

def printMyCat(printer: Printer[Cat], cat: Cat): Unit =
  printer.print(cat)

val catPrinter: Printer[Cat] = CatPrinter()
val animalPrinter: Printer[Animal] = AnimalPrinter()

printMyCat(catPrinter, Cat("Cat1"))
printMyCat(animalPrinter, Cat("Cat1"))
