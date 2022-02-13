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

  println("\n\nPerform dot product of List((1,5),(1,12),(8,3),(12,1)) List(2,4,6,8) with itself and sum elements")
  val l = List(2,4,6,8)
  val p1 = new Point(1, 5, p1707)
  val p2 = new Point(1, 12, p1707)
  val p3 = new Point(8, 3, p1707)
  val p4 = new Point(12, 1, p1707)
  val pl = List(p1,p2,p3,p4)
  zksnarkMSM_model(pl, l).print()
}