package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru2

/*
Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın
 */
fun filtreleme(arrayList: ArrayList<Int>): ArrayList<Int> {
    val tekSayilar = arrayList.filter { it % 2 == 1 } as ArrayList<Int>
    return tekSayilar
}

fun main() {
    val arrayList = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = filtreleme(arrayList)
    println("Tek sayılar: $tekSayilar")
}
