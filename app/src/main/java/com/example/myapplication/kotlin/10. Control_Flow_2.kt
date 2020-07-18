// 10 제어 흐름

// when

// else if else if ... 많을때 when문으로 깔끔하게!

fun main(array: Array<String>) {
    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I do not know value")
        }
    }

    if (value == 1) {
        println("value is 1")
    } else if (value == 2) {
        println("value is 2")
    } else if (value == 3) {
        println("value is 3")
    } else {
        println("I do not know value")
    }

    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
        println(value2)
}