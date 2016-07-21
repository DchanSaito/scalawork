object Main {
  def perfect_num(n: Int): String = {
    val rn = math.sqrt(n).floor.toInt
    def go(t: Int, res: Array[Int]): Array[Int] = {
      if (rn < t)
        res
      else if (n % t == 0)
        go(t+1, res :+ t)
      else
        go(t+1, res)
    }

    val tmp = go(2, Array())
    val prime = Array.concat(tmp.map(n / _), tmp) :+ 1
    val res = prime.distinct.sum
    if (res == n)
      "perfect number"
    else if(res > n)
      "abundant number"
    else
      "deficient number"
  }

  def main(args: Array[String]): Unit = {
    var n = io.StdIn.readInt
    while (n != 0) {
      if (n <= 3)
        println("deficient number")
      else
        println(perfect_num(n))
      n = io.StdIn.readInt
    }
  }
}
