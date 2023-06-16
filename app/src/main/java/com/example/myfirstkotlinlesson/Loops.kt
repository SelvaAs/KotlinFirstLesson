package com.example.myfirstkotlinlesson

fun main(){

    /* var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repeatedly as long as a given condition is true
    while(condition) {
        // code to be executed
    }
  */
    var y = 1
    while(y <= 10) {
        print("$y ")
        y++
    }
    println("\nwhile loop is done")

    var x = 10
    while (x <= 20){
        print("$x ")
        x -= 2
    }
    println("\nwhile loop is done")


    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of the loop.
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }


    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).

    for(num in 1..10) {
        print("$num ")
    }

    // infix notation
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }

    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
        print("$i ") //10 9 8 7 6 5 4 3 2 1
    }

    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
        print("$i ") //2 4 6 8
    }


    for(num in 1..10000) {
        if (num == 9001)
            print("IT'S OVER 9000!!!")
    }

    var humidity = "humid"
    var humidityLevel = 80
    while (humidity == "humid"){
        humidityLevel -= 5
        println("humidity decreased")
        if(humidityLevel < 60){
            humidity = "comfy"
            println("it's comfy now")
        }
    }
}