// 변수의 접근 범위
// 1. 전역 변수
// 2. 지역 변수
// 변수를 만들땐 접근범위를 항상 생각해야하고 접근범위는 최소한으로 하는것이 중요하다!
var number100: Int = 10 //어디서나 접근 가능!


fun main(array: Array<String>) {
    println(number100)
    val test = Test("홍길동")
    test.testFun()
    println(test.name)
    println(number100)

}


class Test(var name: String) {
    fun testFun() {
        var birth: String = "200/3/1"
        name = "홍길동"
        number100 = 100
        // gender testFun3에서만 접근가능

        fun testFun3() {
            var gender: String = "male"
        }
    }

    fun testFun2() {
        name
        //birth 수 ->  testFun 함수에서만 사용가능한 지역변
    }
}