fun main(array: Array<String>) {
    val bankAccount:BankAccount = BankAccount("장준민", 20010219)
    println(bankAccount.name)
    println(bankAccount.birth)


}








// 1) 사칙 연산을 수행할 수 있는 클래스

// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년 월일)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능

class BankAccount(var name: String, var birth: Int) {

}


// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사 M사 K사 3개)
