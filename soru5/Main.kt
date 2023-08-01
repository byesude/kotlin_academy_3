package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru5

/*
Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.
 */
fun main() {
    val liste = arrayListOf(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8, 9)
    println("Listenin tüm elemanları: $liste")

    val tekrarEden = tekrarli(liste)
    println("Tekrar eden elemanlar: $tekrarEden")
}

fun tekrarli(liste : ArrayList<Int>) : HashSet<Int> {
    val tekrarEden = HashSet<Int>()
    val set = HashSet<Int>()

    for (i in liste) {
        if (!set.add(i)) {
            tekrarEden.add(i)
        }
    }

    return tekrarEden
}

