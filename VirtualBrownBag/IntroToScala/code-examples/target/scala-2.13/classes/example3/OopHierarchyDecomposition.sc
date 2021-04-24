trait Person {
  def id: Int

  def name: String

  def department: String

  def isEmployee: Boolean
}

case class Employee(id: Int,
                    name: String,
                    department: String,
                    room: Int) extends Person {

  override def isEmployee: Boolean = true
}

case class Contractor(id: Int,
                      name: String) extends Person {

  override def isEmployee: Boolean = false

  override def department: String = ""
}

def printDepartment(persons: List[Person]): Unit = {
  persons.foreach(x => {
    val department = if (x.isEmployee) x.department else "Not applicable"
    println(s"${x.name}: department: $department")
  })
}

printDepartment(
  List(
    Employee(1, "George", "Software development", 10),
    Employee(2, "Steve", "Software development", 10),
    Employee(3, "Alice", "Cells", 15),
    Contractor(4, "Peter")
  )
)