trait Person

case class Employee(id: Int,
                    name: String,
                    department: String,
                    room: Int) extends Person

case class Contractor(id: Int,
                      name: String) extends Person

def printDepartment(persons: List[Person]): Unit = {
  persons.foreach {
    case Contractor(id, name) => println(s"$name: department: Not applicable")
    case Employee(id, name, department, room) => println(s"$name: department: $department")
  }
}

printDepartment(
  List(
    Employee(1, "George", "Software development", 10),
    Employee(2, "Steve", "Software development", 10),
    Employee(3, "Alice", "Cells", 15),
    Contractor(4, "Peter")
  )
)
