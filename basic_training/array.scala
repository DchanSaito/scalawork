object Arr {
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n+1 >= as.length) true
      else if (ordered(as(n), as(n+1))) go(n + 1)
      else false
    }

    go(0)
  }

  def main(args: Array[String]): Unit = {
    println(findFirst(Array(4, 6, 2, 3, 19), (x: Int) => x == 3))
    println(isSorted(Array(1, 3, 34, 56, 108), (x: Int, y: Int) => x <= y))
    println(isSorted(Array(35, 3, 34, 56, 108), (x: Int, y: Int) => x <= y))    
  }
}
