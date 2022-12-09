fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    //println(Day01(testInput))
    //println(Day01_part2(testInput))

    val input = readInput("Day01")
    //println(Day01_part1(input))
    println(Day01_part2(input))


}

fun Day01_part1(input : List<String>) : Int {

    var greatest: Int = Integer.MIN_VALUE
    var current: Int = 0

    for(i in input.indices) {
        if(input[i] != "") {

            current += input[i].toInt()

        }
        else {
            if(current > greatest) {greatest = current}
            current = 0
        }
    }

    return greatest

}

fun Day01_part2(input : List<String>) : Int {

    var firstGreatest: Int = Integer.MIN_VALUE
    var secondGreatest: Int = Integer.MIN_VALUE
    var thirdGreatest: Int = Integer.MIN_VALUE

    var current: Int = 0

    for(i in input.indices) {
        if(input[i] != "") {

            current += input[i].toInt()

        }
        else {

            val numbers2: List<Int> = Day01_part2_shufflePositionsHelper(listOf(firstGreatest, secondGreatest, thirdGreatest, current).toMutableList())
            firstGreatest = numbers2[0]
            secondGreatest = numbers2[1]
            thirdGreatest = numbers2[2]
            current = numbers2[3]
        }
    }

    val numbers: List<Int> = Day01_part2_shufflePositionsHelper(listOf(firstGreatest, secondGreatest, thirdGreatest, current).toMutableList())


    return numbers[0] + numbers[1] + numbers[2]

}

private fun Day01_part2_shufflePositionsHelper(input: MutableList<Int>): List<Int> {


    if(input[3] > input[0]) {
        input[2] = input[1]
        input[1] = input[0]
        input[0] = input[3]
    }
    else if(input[3] > input[1]) {
        input[2] = input[1]
        input[1] = input[3]
    }
    else if(input[3] > input[2]) {input[2] = input[3]}

    input[3] = 0

//    val list: List<Int> = listOf(input[0], input[1], input[2], input[3])


    return input
}


