fun main() {

    val input = readInput("numbers")
    println("Sum: ${sumAllNums(input)}")
    println("Min: ${findMin(input)}")

    val wordInput = readInput("sentences")
    println(countWords(wordInput))
    println(countHWords(wordInput))

    val hiWordInput = wordInput.map{
        "hi $it"
    }
}

fun sumAllNums(input : List<String>): Int {
//    var total = 0
//    for(num in input) {
//        total += num.toInt()
//    }
//
//    return total

    return input.sumOf {
        it.toInt()
    }
}

fun findMin(input : List<String>) : Int {
    return input.minOf {
        it.toInt()
    }
}

fun findTwoSmallest(input: List<String>) : List<Int> {
//    val sorted = input.map {
//        it.toInt()
//    }.sorted()
//
//    return sorted.take(2)

    return input.map{
        it.toInt()
    }.sorted().take(2)
}

fun countWords(input : List<String>) : Int {

    var wordCount = 0

    for(i in input.indices) {
//        val words = input[i].split(" ")
//        println(words)
//
//        wordCount += words.size

        wordCount += input[i].split(" ").size
    }

    return wordCount

}

fun countHWords(input : List<String>) : Int {
//    var hWordCount = 0
//
//    for(i in input.indices) {
//        val words = input[i].split(" ")
//
//        for(j in words.indices) {
//            if(words[j].lowercase().startsWith("h")) {hWordCount++}
//        }
//
//    }
//
//    return hWordCount

    var count = 0
    for(line in input) {
        count += line.split(" ").count {
            it.startsWith("h", true)
        }
    }

    return count

}