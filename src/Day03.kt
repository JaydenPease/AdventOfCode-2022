fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    //println(Day03_part1(testInput))
    //println(Day03_part2(testInput))

    val input = readInput("Day03")
    println(Day03_part1(input))
    //println(Day03_part2(input))


}


fun Day03_part1(input : List<String>) : Int {

    val alphabet: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var firstCompartment: String = ""
    var secondCompartment: String = ""

    var totalPriority: Int = 0

    for(i in input.indices) {
        firstCompartment = input[i].substring(0, (input[i].length / 2))
        secondCompartment = input[i].substring((input[i].length / 2))

        for (j in firstCompartment.indices) {


            if (secondCompartment.indexOf(firstCompartment.substring(j, j + 1)) != -1) {
                totalPriority += alphabet.indexOf(firstCompartment.substring(j, j + 1), 0, false) + 1
                break
            }

        }
    }

        return totalPriority

    }

fun Day03_part2(input : List<String>) : Int {

    val alphabet: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var totalPriority: Int = 0

    for(i in input.indices) {
        if(i % 3 != 0) {continue}

        for(j in input[i].indices) {
            if(input[i+1].indexOf(input[i].substring(j, j+1)) != -1 && input[i+2].indexOf(input[i].substring(j, j+1)) != -1)
        }
    }

}




