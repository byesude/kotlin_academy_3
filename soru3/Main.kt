package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru3

/*
İki listenin elemanlarını birleştirip sıralayan bir fonksiyon yazın
 */
fun main() {
    val liste1 = arrayListOf(3, 1, 7, 5)
    val liste2 = arrayListOf(6, 2, 9, 4)
    val birlesmisVeSiralanmisListe = birlestirVeSirala(liste1, liste2)

    println("Birleştirilmiş ve sıralanmış liste: $birlesmisVeSiralanmisListe")
}

fun birlestirVeSirala(liste1: ArrayList<Int>, liste2: ArrayList<Int>): ArrayList<Int> {
    val birlesmisListe = ArrayList<Int>()
    birlesmisListe.addAll(liste1)
    birlesmisListe.addAll(liste2)
    birlesmisListe.sort()

    return birlesmisListe
}