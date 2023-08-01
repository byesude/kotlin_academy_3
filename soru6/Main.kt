package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru6

/*
Bir HashSet'in belirli bir elemanı içerip içermediğini kontrol eden bir fonksiyon yazın.
 */
fun main() {
    val sayilar = HashSet<Int>()

    sayilar.add(17)
    sayilar.add(20)
    sayilar.add(33)
    sayilar.add(25)
    sayilar.add(86)

    println(sayilar.contains(10))
}