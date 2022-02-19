package PippengerModel

import Util._

object PippengerModel extends App {

  // small sample curve
  val p1707a = BigInt("0")
  val p1707b = BigInt("7")
  val p1707p = BigInt("17")
  val p1707 = new EllipticCurve(p1707a, p1707b, p1707p)
  val xcoord = BigInt("15")
  val ycoord = BigInt("13")
  val cx = new Point(xcoord, ycoord, p1707)

  println("Print out first 30 EC Points of small example curve. (They will repeat.)")
  (0 until 30) foreach { n => (cx * n).print() }

  // SECP256k1 (curve used in bitcoin)
  val a = BigInt("0000000000000000000000000000000000000000000000000000000000000000", 16)
  val b = BigInt("0000000000000000000000000000000000000000000000000000000000000007", 16)
  val p = BigInt("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F", 16)
  val secp256k1 = new EllipticCurve(a, b, p)
  val gx = BigInt("79BE667EF9DCBBAC55A06295CE870B07029BFCDB2DCE28D959F2815B16F81798", 16)
  val gy = BigInt("483ADA7726A3C4655DA4FBFC0E1108A8FD17B448A68554199C47D08FFB10D4B8", 16)
  val secp256k1gen = new Point(gx, gy, secp256k1)
}