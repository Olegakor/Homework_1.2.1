fun main() {
    // Сумма перевода в рублях
    val amount = 10_000.0

    // Процент комиссии
    val commissionRate = 0.0075
    // Минимальная комиссия
    val minCommission = 35.0

    // Вычислить размер комиссии
    val calculatedCommission = amount * commissionRate

    // Определить окончательную комиссию с учетом минимальной комиссии
    val finalCommission = if (calculatedCommission < minCommission) {
        minCommission
    } else {
        calculatedCommission
    }

    // Вывести результат
    println("Размер комиссии для перевода в размере $amount рублей составляет ${"%.2f".format(finalCommission)} рублей.")
}