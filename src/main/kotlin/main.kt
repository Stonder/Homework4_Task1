fun main() {
    val card = "Maestro"
    val previousAmount = 0
    val moneyTransfer = 4020_00

    println("Комиссия = ${commissionCalculation(card, previousAmount, moneyTransfer) / 100} руб. " +
            "${commissionCalculation(card, previousAmount, moneyTransfer) % 100} коп.")
}

fun commissionCalculation (card: String, previousAmount: Int, moneyTransfer: Int): Int {
    return when (card) {
        "Visa", "Мир" -> if (moneyTransfer * 0.0075 <= 35_00) 35_00 else (moneyTransfer * 0.0075).toInt()
        "Mastercard", "Maestro" -> if (previousAmount < 75000_00) 0 else (moneyTransfer * 0.006 + 20_00).toInt()
        else -> 0
    }
}
