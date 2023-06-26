package com.example.myfirstkotlinlesson

fun main() {
//val numbers:IntArray = intArrayOf(1,2,3,4)
//val numbers = intArrayOf(1,2,3,4)
    val numbers = arrayOf(1, 2, 3, 4) //en yalin haliyle bu sekilde yazilir

    //println(numbers.contentToString())
    for (element in numbers) {
        //print(element) //[LJava.lang.Integer:@36d64342  burda sadece dizinin adresini aliyoruz bu sekilde
        println(" ${element + 2}") //3 4 5 6
        //print("$element +2") //1+2 2+2 3+2 4+2
    }
    println(numbers[2]) //3

    numbers[0] = 6
    numbers[1] = 5
    numbers[3] = 8

    println("final values ${numbers.contentToString()}") //[6,5,3,8]

    val numbersD: DoubleArray = doubleArrayOf(1.2, 3.4, 5.6)

    val days = arrayOf("sun", "mon")
    print(days.contentToString())

    val fruits = arrayOf(Fruit("Apple", 2.3), Fruit("Banana", 1.9))
    //println(fruits.contentToString())
    for (fruit in fruits){
        print("${fruit.name}") //Apple Banana
    }
    for (index in fruits.indices){
        print("${fruits[index].name} is in index $index") //Apple is in index 0Banana is in index 1
    }
    val mix = arrayOf("sun","mon",1,2,3,Fruit("Apple",4.2))
    println(mix.contentToString()) // [sun,mon,1,2,3,Fruit(name=Apple,price=4.2]

}

data class Fruit(val name: String, val price: Double)