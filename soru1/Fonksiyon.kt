package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru1

fun listeElemanlari(arrayList: ArrayList<Int>): Int {
    var toplam = 0
    for (i in arrayList) {
        toplam += i
    }
    return toplam
}
