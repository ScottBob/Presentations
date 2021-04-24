import java.time.LocalDateTime

case class Person(name: String, country: String, city: String, dateOfBirth: LocalDateTime) {
  def age: Int = {
    LocalDateTime.now().minusYears(dateOfBirth.getYear).getYear
  }
}

val persons = List(
  Person("Ivan", "Bulgaria", "Sofia", LocalDateTime.of(1982, 3, 25, 0, 0)),
  Person("Steve", "UK", "London", LocalDateTime.of(1980, 5, 14, 0, 0)),
  Person("Alice", "US", "New York", LocalDateTime.of(1985, 6, 12, 0, 0))
)

persons
  .map(x => x.toString) // to string will print object state, but not object reference
  .foreach(x => println(x))
