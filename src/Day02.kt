fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    //println(Day02_part1(testInput))
    //println(Day02_part2(testInput))

    val input = readInput("Day02")
    //println(Day02_part1(input))
    println(Day02_part2(input))


}


    fun Day02_part1(input : List<String>) : Int {

        var totalScore:Int = 0
        var currentRoundScore: Int = 0

        var opponentHand: Int = 0
        var myHand: Int = 0

        for(i in input.indices) {

            when {
                input[i].indexOf("A") > -1 -> opponentHand = 1
                input[i].indexOf("B") > -1 -> opponentHand = 2
                input[i].indexOf("C") > -1 -> opponentHand = 3
            }

            when {
                input[i].indexOf("X") > -1 -> myHand = 1
                input[i].indexOf("Y") > -1 -> myHand = 2
                input[i].indexOf("Z") > -1 -> myHand = 3
            }

            if(opponentHand == myHand) {
                currentRoundScore = myHand + 3
            }

            else if(myHand - opponentHand == 1 || myHand - opponentHand == -2) {
                currentRoundScore = myHand + 6
            }

            else if(myHand - opponentHand == -1 || myHand - opponentHand == 2) {
                currentRoundScore = myHand + 0
            }

            totalScore += currentRoundScore
            currentRoundScore = 0

        }


        return totalScore
    }

fun Day02_part2(input : List<String>) : Int {

    var totalScore:Int = 0
    var currentRoundScore: Int = 0

    var opponentHand: Int = 0
    var myHand: Int = 0

    for(i in input.indices) {

        when {
            input[i].indexOf("A") > -1 -> opponentHand = 1
            input[i].indexOf("B") > -1 -> opponentHand = 2
            input[i].indexOf("C") > -1 -> opponentHand = 3
        }

        when {
            input[i].indexOf("X") > -1 -> {
                myHand = opponentHand - 1
            }

            input[i].indexOf("Y") > -1 -> {
                myHand = opponentHand
                currentRoundScore += 3
            }
            input[i].indexOf("Z") > -1 -> {
                myHand = opponentHand + 1
                currentRoundScore += 6
            }
        }

        when {
            myHand == 0 -> myHand = 3
            myHand == 4 -> myHand = 1
        }



        totalScore += currentRoundScore + myHand
        currentRoundScore = 0

    }


    return totalScore
}