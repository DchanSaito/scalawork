object Main {
  def main(args: Array[String]): Unit = {
    val n = io.StdIn.readInt()
    for(q <- 0 until n) {
      val nk = io.StdIn.readLine().split(" ").map(_.toInt)
      val x = io.StdIn.readLine().split(" ").map(_.toInt)

      if (nk(0) <= nk(1)) {
        println(0)
      } else if (nk(1) == 1) {
        println(x(x.length-1) - x(0))
      } else {
        val x_len = for(i <- 0 until x.length - 1) yield x(i+1) - x(i)
        val sort_x_len = x_len.sorted
        val res = for(i <- 0 to x_len.length - nk(1)) yield sort_x_len(i)
        println(res.sum)
      }
    }
  }
}
