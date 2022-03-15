package Tasks.GitHub

/**
 * Простая (2 балла)
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */

fun main() {
    println(accountInThreeYears(100, 10)) // 133.1
}

fun accountInThreeYears(initial: Int, percent: Int): Double {
    var withPercents = initial.toDouble()
    repeat(3) { withPercents += calcPercents(withPercents, percent) }
    return withPercents

    // return initial * Math.pow(1 + percent / 100.0, 3.0)
}

fun calcPercents(number: Double, percent: Int): Double = number / 100 * percent