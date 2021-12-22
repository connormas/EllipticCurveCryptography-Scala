package PippengerModel

import Util._

object PippengerModel extends App {

  /**
   * This mimics what the MSM part of zkSNARK does. It takes in two vectors.
   * One vectors of scalars, and another vector of points. It multiplies each
   * scalar by its corresponding point and them sums up all the points.
   * (right now, we are just doing this with two int vectors to verify
   * that it is working properly.)
   */
  def zksnarkMSM_model(g: List[Int], e: List[Int]): Int = {
    assert(g.length == e.length, "vectors should be the same length")
    (g.map(x => x * e(g.indexOf(x)))).sum
    // multipy corresponding indexes of arrays and sum them up
  }

  // print out the first 15 points on this elliptic curve
  val p1707 = new EllipticCurve(0, 7, 17)
  val cx = new Point(15, 13, p1707)
  for (n <- 0 until 15) {
    val pmul = cx * n
    pmul.print()
  }
}