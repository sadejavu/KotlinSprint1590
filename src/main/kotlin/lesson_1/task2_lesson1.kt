package org.example.lesson_1

fun main() {
    var amountOfOrders: Int = 75
    val gratitudeMessage: String = "Thank you for your order!" // здесь val поскольку текст благодарности не будет меняться

    //Вывод переменных
    println(amountOfOrders)
    println(gratitudeMessage)

    //Создание переменной с работниками
    var numberOfEmployees: Int = 2000
//    println(numberOfEmployees)
    numberOfEmployees--
    println(numberOfEmployees)
}