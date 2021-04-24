trait Animal {
  def name: String
}

case class Cat(name: String) extends Animal

case class Dog(name: String) extends Animal

// list is covariant generic collection
val cats: List[Cat] = List(Cat("Cat1"), Cat("Cat2"))
val dogs: List[Dog] = List(Dog("Dog1"), Dog("Dog2"))

def printAnimalNames(animals: List[Animal]): Unit = {
  animals.foreach {
    animal => println(animal.name)
  }
}

printAnimalNames(cats)

printAnimalNames(dogs)
