val one = List(1, 2, 3)
val two = List(4, 5)
val three = one ::: two
val four = 1 :: two
println(three)
println(four)
val make = 1 :: 2 :: 3 :: Nil
println(make)
println(make(2))
// Listがかえる
println(make.drop(2))
// Boolean
println(make.exists(s => s == 3))
// Listがかえる
println(make.filter(s => s == 1))
// Booleanがかえる
println(one.forall(s => s >= 2))
