// 23. 접근 제어자


fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")

        // private 키워드 때문에 외부에서 더 이상 사용할 수 없다.
  //  testAccess.test()
   // println(testAccess.name)
   // testAccess.name = "아무개 투"
   // println(testAccess.name)

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
    //runningCar.run() 사용자가 사용하지 않았으면 해서 private 처리했음.


    val reward: Reward = Reward()
    reward.rewardAmount = 2000
}

class Reward() {
    var rewardAmount: Int = 1000

}



class TestAccess {
   private var name: String = "홍길동" //클래스 안의 변수를 외부에서 사용하지 못하게 하려면 private 키워드를 사용한다.

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String) {
        this.name = newName
    }

   private fun test() {
        println("테스트")
    }
}

class RunningCar() {

    fun runFast() {

        run()
    }

   private fun run() {

    }
}