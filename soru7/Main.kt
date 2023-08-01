package com.example.kotlinuygulamaseansi.uygulamaseansi3_01082023.soru7

/*
Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın
 */
fun birlestir(hashSet1: HashSet<Int>, hashSet2: HashSet<Int>): HashSet<Int> {
    val birlesmisHashSet = HashSet<Int>()
    birlesmisHashSet.addAll(hashSet1)
    birlesmisHashSet.addAll(hashSet2)
    return birlesmisHashSet
}

fun main() {
    val hashSet1 = HashSet<Int>()

    hashSet1.add(12)
    hashSet1.add(45)
    hashSet1.add(62)

    val hashSet2 = HashSet<Int>()

    hashSet2.add(30)
    hashSet2.add(70)
    hashSet2.add(12)
    hashSet2.add(54)

    val birlesmisHashSet = birlestir(hashSet1, hashSet2)
    println("Birleştir: $birlesmisHashSet")
}
