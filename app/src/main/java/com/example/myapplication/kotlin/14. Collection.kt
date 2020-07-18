// 14. Collection
// -> list, set, map
// List

fun main(array: Array<String>) {

    //Immutable collection(변경 및 추가 불)
    //List -> 중복을 허용한다.
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList.get(0))
    println(numberList[0])



    // Set -> 중복을 허용하지 않는다.
    // -> 순서가 없다!!! 즉 인덱스가 없
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach { i ->
        println(i)
    }


    // Map -> Key, Value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))






    // Mutabale Collection가(변경 및 추가 가능)
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(10)
    println()
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println()
    println(mNumberMap)




}