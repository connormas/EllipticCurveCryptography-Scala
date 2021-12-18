package Demo

object PatternMatching extends App {
  // switch expression
  val anInteger = 55
  val order = anInteger match {
    case 1 => "first"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  // pattern match is an EXPRESSION
  println(order)

  case class Person(name: String, age: Int)

  val connor = Person("connor", 21) // Person.apply("connor", 21)

  // case class decomposition
  val personGreeting = connor match {
    case Person(n, a) => s"Hi, my name is $n and I am $a years old."
    case _ => "Something else"
  }
  println(personGreeting)

  // can also decompose primitives, tuples, lists,
}
