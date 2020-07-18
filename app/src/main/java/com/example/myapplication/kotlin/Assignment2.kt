fun main(array: Array<String>) {
    val bankAccount: BankAccount = BankAccount("장준민", 20010219, 200000, 50000, 100000)
    val math: Math = Math(13, 13)
    val television:Television = Television((122))


    println(math.Plus(11, 13))
    println(math.Minus(13, 1))
    println(math.Multiply(13, 13))
    println(math.Divide(12, 6))
    println(television.ChangeChannel(125))
    println(television.TurnOff())
    // bankAccount.CreateBankAccount()
    //bankAccount.CheckCash(200000)
    //bankAccount.OutCash(50000)
    //bankAccount.InCash(2000)
}


// 1) 사칙 연산을 수행할 수 있는 클래스
class Math(var a: Int, var b: Int) {
    fun Plus(a: Int, b: Int): Int {
        val resultPlus = a + b
        return resultPlus
    }

    fun Minus(a: Int, b: Int): Int {
        val resultMinus: Int = a - b
        return resultMinus
    }

    fun Multiply(a: Int, b: Int): Int {
        val resultMultiply: Int = a * b
        return resultMultiply
    }

    fun Divide(a: Int, b: Int): Int {
        val resultDivide: Int = a / b
        return resultDivide
    }
}

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능

class BankAccount(var name: String, var birth: Int, var cash: Int, var out: Int, var In: Int) {
    init {
        println("계좌 생성을 진행합니다.")
    }

    fun CreateBankAccount() {
        print("이름을 입력하시오")
        val yourName = readLine()!!.toString()
        println("당신의 이름은 $yourName 입니다.")
        print("생년월일을 입력하시오")
        val yourBirth = readLine()!!.toInt()
        println("당신의 생년월일은 $yourBirth 입니다.")
        println("계좌가 생성 완료 되었습니다.")
    }

    fun CheckCash(cash: Int) {
        println("당신의 잔액은 $cash 원 입니다.")
    }

    fun OutCash(out: Int) {
        println("$out 원 출금이 완료되었습니다")
    }

    fun InCash(In: Int) {
        println("$In 원 입금 되었습니다.")
    }
}


// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)
class Television(var channel: Int) {
    init {
        var initialchannel = mapOf<Int, String>(11 to "MBC", 5 to "SBS", 7 to "KBS")
    }


    fun TurnOn() {
        println("on")

    }

    fun TurnOff() {
        println("off")
    }

    fun ChangeChannel(channel: Int) {
        if (channel == 125) {
            println("Tooniverse로 채널 변경")
        } else if (channel == 126) {
            println("jtbc로 채널 변경")
        }else {
            println("변경할수있는 채널이 없습니다. 유선 가입 하셈")
        }
    }
}