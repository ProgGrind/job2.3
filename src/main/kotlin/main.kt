package ru.netology

fun main() {
    print("Какая сумма покупок у клиента? Напишите: ")
    val allPurchases = readLine()?. toFloat() ?: return
    print("Ваш клиент - меломан? Напишите да или нет: ")
    val isMelomanQuestion = readLine()?. toString() ?: return
    val isMeloman = isMelomanQuestion == "да"

    print("Сколько стоит товар? Напишите: ")
    val itemPrice = readLine()?. toFloat() ?: return

    val lowDiscountStart = 1_000
    val highDiscountStart = 10_001


    val discount: Float = if (allPurchases > lowDiscountStart && allPurchases < highDiscountStart)
        100F
    else if (allPurchases >= highDiscountStart)
        itemPrice * 0.05F
    else 0F

    val result = if (isMeloman)
        (itemPrice - discount) * 0.99
    else itemPrice - discount

    println("Сумма к оплате: $result")

}