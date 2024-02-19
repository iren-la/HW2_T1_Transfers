
fun main () {
    //Homework 1
    val commissionSize = 0.0075
    val minCommission = 35
    val amount = 10_000

    var commission = if (amount*commissionSize > minCommission) amount*commissionSize else minCommission
    println(commission)
    println()

    //Homework 2
    val likes = 141
    val likesToString = "$likes"; //преобразуем в строку, чтобы определить окончание

    if (likesToString.endsWith('1') && !likesToString.endsWith("11")) {
        println("Понравилось " + likes + " человеку.")
    } else {
        println("Понравилось " + likes + " людям.")
    }
}