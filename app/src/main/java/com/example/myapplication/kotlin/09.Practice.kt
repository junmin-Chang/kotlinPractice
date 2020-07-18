fun main(array: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }


    if (b + c == 110) {
        println("b plus c equal 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자 (?:) -> null 인 경우에 : 옆에 숫자가 출
    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

//값을 리턴하는 if문을 사용할시에 값을 반드시 리턴해야함 else 필요!
    val num1: Int = 10
    val num2: Int = 20


    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }

    println()
    println(max)

}