import kotlin.math.abs

// 1번 문제
/* list를 두개 만든다
첫번째 list에는 0부터 9까지 값을 넣는다 (초기값이 아닌 반복문 사용해서 값을 넣음)
두번째 list에는 첫번째 List의 값을 하나씩 확인한 후
짝수면 True 홀수면 False를 넣어준다.

// 2번 문제
학점을 구하자
80 - 90 -> A
70 - 79 -> B
60 - 69 -> C
나머지 F

// 3번 문제
전달 받은 숫자의 각 자리 숫자의 합을 구하자
조건: 전달 받은 숫자는 무조건 두자리 숫자이다.

// 4번 문제(도전)
구구단을 출력하자.
 */

// 1번 문제

fun main(array: Array<String>) {
    first()
    second()
    third()
    fourth()
}


fun first() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 1..9) {
        list1[i - 1] = i
    }

    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            list2[index] = true
        } else {
            list2[index] = false
        }
    }
    println(list2)

}

// 2번 문제

fun second() {
    print("Enter Integer")
    var score: Int = readLine()!!.toInt()

    when (score) {
        in 80..90 -> println('A')
        in 70..79 -> println('B')
        in 60..69 -> println('C')
        else -> println('F')
    }


}

// 3번 문제

fun third() {
    print("Enter you number")
    var numberOfYour: Int = readLine()!!.toInt()

    val sum1 = numberOfYour / 10
    val sum2 = numberOfYour % 10

    println(sum1 + sum2)


}

// 4번 문제

fun fourth() {
    for (j in 2..9) {
        println("--$j 단 시작--")
        for (k in 1..9) {
            println("$j X $k = " + j * k)
        }
    }

}