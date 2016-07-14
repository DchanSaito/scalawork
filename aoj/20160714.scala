object Main {
  def ironuri(ar: Array[String], rm: Array[Int][Int], px: Int, py: Int, rx: Int, ry: Int): Array[Int] = {
    val lx = px - 1
    val ly = py
    val rx = px + 1
    val ry = py
    val tx = px
    val ty = py - 1
    val bx = px
    val by = py + 1
    # ここから先色塗りしようと思ってた

  def slove(ar: Array[String],room: Array[Int]): Int = {
    
    var start = -1
    var y = -1
    for(i <- 0 until ar.length) {
      val tmp = ar(i).indexOf('@')
      if (tmp != -1) {
        start = tmp
        y = i
      }
    }
    y
  }

  def main(args: Array[String]) = {
    val room = Array(6, 9)
    val tile = Array(
      "....#.",
      ".....#",
      "......",
      "......",
      "......",
      "......",
      "......",
      "#@...#",
      ".#..#.")
    println(slove(tile))
  }
}
