package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru1

/*
Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.
 */
fun listeElemanlari(liste: ArrayList<Int>): Int {
    var toplam = 0
    for (i in liste) {
        toplam += i
    }
    return toplam
}

fun main() {
    val liste = arrayListOf(1, 2, 3, 4, 5)
    val toplam = listeElemanlari(liste)
    println("Liste elemanları: $liste")
    println("Listedeki tüm elemanların toplamı: $toplam")
}


