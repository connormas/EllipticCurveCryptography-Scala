package Demo

object demo extends App {
  // types Int, Boolean, Char, Double, Float, String
  // Unit Type is Scala's NULL
  val age = 10
  println(s"my age is $age")



  // "interface"
  trait ultimateabstract {
    def func(): Unit
  }

  // scala has single class inheritance, multi-trait mixing
  // operators in scala are methods! something something functional languages
  // singleton: only instance of an object
  // apply method automatically invoked with className(arg)

  /* case classes - lightweight data structure
  *  - sensible equals and hash code
  *  - serialization
  *  - companion with apply
  *  - pattern matching */
  case class Person(name:String, age:Int)
  // made without new keyword
  val bob = Person("Connor", 21) //Person.apply("Bob", 21)

  // generics
  abstract class MyList[T] {
    def head: T
    def tail: MyList[T]
  }

  val double: Function1[Int, Int] = (x: Int) => 2 * x

  val result = double(8)
  println(s"result of double(8) = $result")

  // higher-order functions take functions or return functions as arguments

}
