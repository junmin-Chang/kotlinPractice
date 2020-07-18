// 두번까지만 봐준다
// 두번 이상이 넘어가면 리팩토링(정리 정돈) 해라.


// 25. 상속
// 부모로부터 설명서를 물려받는다.

// 클래스를 선언할때 기본적으로 private가 붙으므로 open 키워드를 부모 클래스에 붙여서 상속이 가능하게끔 만든다.


fun main(array: Array<String>) {

    val superCar100: SuperCar100 = SuperCar100()

    println(superCar100.drive())
    //superCar100.drive()
    //superCar100.stop()

    val bus100: Bus100 = Bus100()
    //bus100.drive()
    //bus100.stop()

}

// 부모: Car100
// 자식: SuperCar100 , Bus100
open class Car100() {

    open fun drive(): String {
        return "달린다"


}

fun stop() {

}
}

class SuperCar100() : Car100() {

    override fun drive(): String {

        val run = super.drive()

        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}
