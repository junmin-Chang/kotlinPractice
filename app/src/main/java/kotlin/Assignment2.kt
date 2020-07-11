fun main(array: Array<String>) {
    val bankAccount:BankAccount = BankAccount("장준민", 20010219)
    bankAccount.CreateBankAccount()

    bankAccount.CheckCash(2000000)
    bankAccount.OutCash(20000)
}








// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능

class BankAccount(var name: String, var birth: Int) {
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
        println("출금이 완료되었습니다")
    }
}



// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)
