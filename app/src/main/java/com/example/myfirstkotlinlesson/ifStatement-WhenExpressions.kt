package com.example.myfirstkotlinlesson

fun main(){
    // Control Flows
    // If Statements
    var age = 17


    if(age >= 21){
        print("now you are older than 20")
    }
    // Else If Statement - only executed if the if statement is not true
    else if(age >= 18){
        print("now you may vote")
    }
    // Else If Statement - only executed if the foregoing else if statement is not true
    else if (age >= 16){
        print("you now may drive")
    }
    // else is only executed if all of the foregoing statements weren't true
    else{
        print("you're too young")
    }

    var isRainy = true
    if (isRainy)
        println("it is rainy")


    // Kotlin’s "when" expression is the replacement of the switch statement
    // from other languages like C, C++, and Java.
    // It is compact and more powerful than switch statements.
    var season = 3
    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> println("Fall")
        4 -> println("Winter")
        else -> println("Invalid Season")
    }
    var month = 3
    when(month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    // challenge - translate the if statement with the age to a when expression
    when(age){
        // with the !in it's the same as saying not in ...
       !in 0..20  -> print("now you are older than 20")
        //burda unlem isareti kullaniriz.0 ve 20 araliginda degilse anlami katar
        in 18..20  -> print("now you may vote")
        16,17 -> print("you now may drive")
        else -> print("you're too young")
    }

    /*

    var x : Any = 13.37
    when(x) {
    is Int -> println("$x is an Int")
    !is Double -> println("$x is not Double")
        //burdaki gibi umlemli yazarsak var degiskeni string yapi da olsa bile
        // konsolda string olarak gostermeyecektir.Cunku is not double oldugundan
        //bu ifadeyi dogru kabul ettigi icin alt satira gecmeyecektir.
    is String -> println("$x is a String")
    else -> println("$x is none of the above")
    }
    //13.37 is a Double
  */

    val x : Any = 13.37
//assign when to a variable
    val result =  when(x) {
//let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
//then print x with the result
    print("$x $result")
}