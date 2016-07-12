object Main {
  def insert(ar: Array[Int]): Array[Int] = {
    for (i <- 1 until ar.length) {
      val v = ar(i)
      var j = i - 1
      while (j >= 0 && ar(j) > v) {
        ar(j+1) = ar(j)
        j = j - 1
      }
      ar(j+1) = v
    }
    ar
  }

  def main(args: Array[String]): Unit = {
    val test = Array(56, 23, 43, 54, 26, 76, 23, 4, 7, 100, 239, 432, 434, 346, 974, 98, 60)
    val res = insert(test)
    for (r <- res) println(r)
  }
}
