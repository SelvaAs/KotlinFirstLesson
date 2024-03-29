package com.example.myfirstkotlinlesson

fun main(){
    myFunction()
    val result = addUp(3,6)
    println("result is $result") //result is 9
    println(addUp(5,3)) //8
    println(avg(3.2,5.3)) //4.25
}

// The syntax of a function -fun stands for function
fun myFunction(){
    // The body of a function
    println("myFunction was called")
}

// This function has two parameters and returns a value of type Int
fun addUp(a: Int, b: Int): Int{
    // the return keyword indicates that this function will return the following value
    // once this function is called and executed
    return (a+b)
}

// CHALLENGE: create a function that calculates the average and call it
fun avg(a: Double, b: Double): Double {
    return  (a + b)/2
}
