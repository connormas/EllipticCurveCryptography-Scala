package Demo

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

object Advanced extends App {
  // lazy evaluation not evaluated until first use
  lazy val aLazyVal = 2;
  lazy val lazyValWithSideEffect = {
    println("I am so very lazy")
    43
  }

  val eagerValue = lazyValWithSideEffect + 1;

  // "pseudo-collection": Option, Try
  def methodWhichCanReturnNull(): String = "Hello Scala"

  val anOption = Option(methodWhichCanReturnNull()) // option = "collection" which contains at most one value

  val stringProcessing = anOption match {
    case Some(string) => s"I have obtained a valid string: $string"
    case None => "I obtained nothing"
  }
  //println(stringProcessing)

  def methodWhichCanThrowException(): String = throw new RuntimeException

  val aTry = Try(methodWhichCanThrowException())
  // a try = "collection" with either a value or an exception
  val anotherStringProcessing = aTry match {
    case Success(value) => s"I have obtained $value"
    case Failure(exception) => s"I have obtained $exception"
  }
  println(anotherStringProcessing)

  // evaluate something on another thread
  //val aFuture = Future {
  //  println("Loading...")
  //  Thread.sleep(1000)
  //  println("I have computed a value.")
  //  67
  //}
  // future is a "collection" which contains a value when it's evaluated
  // is composable with map, flatMap, and filter
  // Option, Try, and Future, are Monads

  // Implicits

  // implicit args
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1
  implicit val myImplicitInt = 46
  println(aMethodWithImplicitArgs)

  implicit class MyRichInteger(n: Int) {
    def isEven() = n % 2 == 0
  }

  println(23.isEven()) // new MyRichInteger(23).isEven()
}