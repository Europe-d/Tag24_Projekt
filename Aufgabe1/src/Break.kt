fun main() {
    val numbers: List<Int> = listOf(62,42, 364, 235, 57, 68, 2, 325, 6,  7, 57, 3, 246, 24, 62, 46, 7346, 34)


    println("bitte finden sie ein nummer")

    var nummer: Int = readln().toInt()


    for (i in numbers.reversed()) {
        if (nummer == i) {
            println("ja die nummer $i hast du gewonnen")
            break
        } else {
            println(" leider nicht gefunden")


        }
    }
}
//
//println("leider nicht gefunden")
//break