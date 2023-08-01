package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru9

/*
Bir SetOf'taki elemanları diğer bir SetOf'tan çıkaran bir fonksiyon yazın
 */
fun fonk(set1 : Set<Int>, set2 : Set<Int>) : Set<Int> {
    return set1 - set2
}

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5, 6)
    val set2 = setOf(3, 4, 5)

    val fark = fonk(set1, set2)
    println("İki setin farkı: $fark")
}
