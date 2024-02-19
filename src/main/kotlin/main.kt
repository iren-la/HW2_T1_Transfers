
fun main () {
    val commissionSize = 0.0075
    val minCommission = 35
    val amount = 10_000

    var commission = if (amount*commissionSize > minCommission) amount*commissionSize else minCommission
    println(commission)
}