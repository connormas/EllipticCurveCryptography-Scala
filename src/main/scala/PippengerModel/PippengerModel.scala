package PippengerModel

import Util._

object PippengerModel extends App {

  // print out the first 15 points on this elliptic curve
  val p1707a = BigInt("0")
  val p1707b = BigInt("7")
  val p1707p = BigInt("17")
  val p1707 = new EllipticCurve(p1707a, p1707b, p1707p)
  val xcoord = BigInt("15")
  val ycoord = BigInt("13")
  val cx = new Point(xcoord, ycoord, p1707)

  println("Print out first 25 EC Points. (They will repeat.)")
  for (n <- 0 to 34) {
    val pmul = cx * n
    pmul.print()
  }

  println("\n\nPerform zkSNARK MSM sim")
  val l = List(4,5,2,34,2,5,6,7)



  var mylist = (0 until 30).toArray

}