package com.example.myfirstkotlinlesson

fun main(){

    val fruits = setOf("Apple","Orange","Banana","Apple")
    println(fruits) //Apple,Orange,Banana

    val newFruit = fruits.toMutableList()
    newFruit.add("Water Melon")
    newFruit.add("Pear")
    println(newFruit.elementAt(3)) //Water Melon


    val daysOfWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    for (key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}") //1 is to Monday2 is to Tuesday3 is to Wednesday
    }

    val fruitsMap = mapOf("Favorite " to Fruit("Apple",2.1),"OK" to Fruit("MAngo",5.3))

    val newDaysOfWeek = daysOfWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    println(newDaysOfWeek.toSortedMap())
}


data class Fruit(val name:String, val price:Double)