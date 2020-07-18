// 28. 인터페이스
// -인터페이스도 구현이 있는 함수를 만들 수 있다.
// - 인터페이스에 구현이 있는 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
// - 인터페이스에 구현이 없는 함수는 그 인터페이스를 구현 하는 클래스에서 그 함수를 만드시 구현해야한다.


fun main(array: Array<String>) {
    val student = Student__()
    student.sleep()
}


interface Person__ {
    fun eat() {
        println("먹는다")

    }

    fun sleep() {
        println("잔다")
    }
    abstract fun stduy()  // abstract를 붙이면 반드시 구현해야만 하는 함수로 표기 가
}

class Student__ : Person__ {

    override fun stduy() {

    }
}

class Teacher__ : Person__ {
    override fun stduy() {

    }
}