package com.example.myfirstkotlinlesson

fun main() {
///val numbers:IntArray = intArrayOf(1,2,3,4)
//val numbers = intArrayOf(1,2,3,4)
val numbers = arrayOf(1, 2, 3, 4) //en yalin haliyle bu sekilde yazilir

//println(numbers.contentToString())
    for (element in numbers){
        print(element)
    }


}
