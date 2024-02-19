
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
    val likesToString = "$likes" //преобразуем в строку, чтобы определить окончание

    if (likesToString.endsWith('1') && !likesToString.endsWith("11")) {
        println("Понравилось " + likes + " человеку.")
    } else {
        println("Понравилось " + likes + " людям.")
    }
    println()

    //Homework 3
    val minSum = 1_000
    val maxSum = 10_000
    val discountFromMinSum = 100
    val discountOverMaxSum = 0.05
    val specialDiscount = 0.01

    val sumOrder = 5_000 //сумма покупки
    val permanentCustomer = true //признак постоянного покупателя

    var result = sumOrder

    //рассчитываем скидки от суммы покупки
    if (sumOrder > maxSum) {
        result = (sumOrder - (sumOrder * discountOverMaxSum)).toInt()
    } else if (sumOrder > minSum) {
        result = (sumOrder - discountFromMinSum)
    }

    //проверяем признак постоянного покупателя
    if (permanentCustomer) {
        result -= (result * specialDiscount).toInt()
    }

    println("Итоговая стоимость: " + result + " руб.")

}