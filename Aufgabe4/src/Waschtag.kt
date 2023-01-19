fun main() {
    val shirts = mutableListOf(
        "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau", "blau",
        "blau", "rot", "blau", "rot", "blau", "blau", "rot", "rot", "blau"
    )


    var rotShirts = mutableListOf<String>()
    var blueShirts = mutableListOf<String>()
    var i = 0

    while (i <= shirts.size - 1) {
        if (shirts[i] == "rot") {
            rotShirts.add(shirts[i])
        } else if(shirts[i]== "blau"){
            blueShirts.add(shirts[i])
        }
       i++

    }
    println(shirts)
    println(rotShirts)
    println(blueShirts)
    shirts.clear()
    println(shirts)
}