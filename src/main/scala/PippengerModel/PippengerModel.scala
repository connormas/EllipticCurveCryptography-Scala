package PippengerModel

import Util._

object PippengerModel extends App {

  // print out the first 15 points on this elliptic curve
  val p1707 = new EllipticCurve(0, 7, 17)
  val cx = new Point(15, 13, p1707)

  println("Print out first 25 EC Points. (They will repeat.)")
  for (n <- 0 until 25) {
    val pmul = cx * n
    pmul.print()
  }

  println("Perform dot product of List(1,2,3,4,5) with itself and sum elements")
  val l = List(1,2,3,4,5)
  println(zksnarkMSM_model(l, l))
}