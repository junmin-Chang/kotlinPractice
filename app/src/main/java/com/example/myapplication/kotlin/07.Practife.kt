fun main(array: Array<String>) {
// 산술 연산자
    var a = 10 + 1
    var b = 10 - 1
    var c = 1 * 9
    var d = 20 / 3
    var e = 20 % 3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
//  대입 연산자
    var f = 5


    // 복합 대입 연산자
    a += 10
    b -= 10
    c *= 3
    d /= 4
    e %= 2
    println()
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 증감 연산자
    a++
    b--
    println()
    println(a)
    println(b)

    // 비교 연산자
    var g = a > b
    var h = a == b
    var i = !h
    var l = i != h

    println()
    println(g)
    println(h)
    println(i)
    println(l)

    // 논리 연산자
    val j = h && i
    val k = h || i
    println()
    println(j)
    println(k)

}