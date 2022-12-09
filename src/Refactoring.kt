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