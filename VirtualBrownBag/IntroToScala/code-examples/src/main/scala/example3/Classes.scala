package example3

object Classes {

  trait Product {
    def getBrand: String
  }

  trait Flying {
    def fly(): Unit
  }

  abstract class Airplane(boardId: Int) extends Product with Flying {
    override def fly(): Unit = {
      // fly implementation
    }
  }

  class A320(boardId: Int) extends Airplane(boardId) {
    override def getBrand: String = "Airbus"
  }

  class B737(boardId: Int) extends Airplane(boardId) {
    override def getBrand: String = "Boeing"
  }

  // class with companion object
  class Person(id: Int,
               name: String,
               email: String)

  object Person {
    def apply(id: Int, name: String, email: String): Person = new Person(id, name, email)
  }

  val p: Person = Person(1, "Ivan", "ivan@work.com") // create instance without using new keyword

  // case class
  case class CasePerson(id: Int, name: String, email: String)

  val cp: CasePerson = CasePerson(1, "Ivan", "ivan@work.com")

}
