fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }



    val input = readInput("GiftExchange")
    println(createPairs(input))


}

fun createPairs(input: List<String>): MutableList<String>? {

    if(input.size % 2 != 0) {return null;}

    val newInputGivers: MutableList<String> = input.toMutableList()
    val newInputReceivers: MutableList<String> = newInputGivers


    val pairs: MutableList<String> = listOf<String>().toMutableList()
    var firstName: String = ""
    var secondName: String = ""

    while(newInputGivers.isNotEmpty()) {
        firstName = newInputGivers[0]
        newInputGivers.removeAt(0)

        val secondNameIndex: Int = ((Math.random() * (newInputReceivers.size - 2)) + 1).toInt()
        secondName = newInputReceivers[secondNameIndex]
        newInputReceivers.removeAt(secondNameIndex)

        val newPair = "$firstName + $secondName"
        pairs.add(newPair)

    }


    return pairs

}


