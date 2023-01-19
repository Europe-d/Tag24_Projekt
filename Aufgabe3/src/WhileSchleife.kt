
val numbers: MutableList<Double> = mutableListOf(25.0, 33.3, 50.0, 100.0)



fun main() {


println(numbers)
    neunNummer(4)
    neunNummer(5)


}


fun neunNummer(nummer: Int){
    var i = 0



    while (i < numbers.size) {
        numbers[i]=numbers[i] * nummer
        i++
    }
    println(numbers)
}
