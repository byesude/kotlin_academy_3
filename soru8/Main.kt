package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru8

/*
Verilen bir listeyi SetOf olarak döndüren bir fonksiyon yazın (tekrar eden elemanları çıkarır).
 */
fun fonk(liste : List<Int>) : Set<Int> {
    return liste.toSet()
}

fun main() {
    val liste = listOf(1, 2, 3, 2, 4, 5, 3, 2, 5)
    val setListe = fonk(liste)
    println("SetOf'a dönüştürülen liste: $setListe")
}

