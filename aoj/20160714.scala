object Main {
  def bfs(ar: Array[String], x: Int, y: Int, w: Int, h: Int): Array[String] = {
    if (x < 0 || x >= w || y < 0 || y >= h)
      return ar
    if (ar(y)(x) != '.')
      return ar
    // イミュータブルやるにはわからなかった
    var br = ar
    br(y) = br(y).patch(x, "C", 1)
    br = bfs(br, x - 1, y, w, h)
    br = bfs(br, x + 1, y, w, h)
    br = bfs(br, x, y + 1, w, h)
    br = bfs(br, x, y - 1, w, h)
    return br
  }


  def solve(ar: Array[String], room: Array[Int]): Int = {
    var x = -1
    var y = -1
    for(i <- 0 until ar.length) {
      val tmp = ar(i).indexOf('@')
      if (tmp != -1) {
        x = tmp
        y = i
      }
    }
    var br = ar
    br(y) = br(y).patch(x, ".", 1)
    br = bfs(br, x, y, room(0), room(1))
    var cnt = 0
    for(res <- br)
      cnt += res.count{_ == 'C'}
    cnt
  }

  def main(args: Array[String]) = {
    var room = io.StdIn.readLine().split(' ').map(_.toInt)
    while (room(0) != 0) {
      val ar = new Array[String](room(1))
      for (i <- 0 until room(1))
        ar(i) = io.StdIn.readLine()
      println(solve(ar, room))
      room = io.StdIn.readLine().split(' ').map(_.toInt)
    }
  }
}
