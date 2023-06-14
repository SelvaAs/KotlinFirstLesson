package com.example.myfirstkotlinlesson

fun main(){
    //String
    val name = "Selvi"
    var firstStr = name[0]
    var lastStr = name[name.length-1]
    val myLength = name.length

   print("First character $firstStr")

  //  print("First character $firstStr and the length of name is ${name.length} ")


    //Arithmetic operators
    var result = 5+3
    result +=2
   // println(result)

    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a/b
   // print(resultDouble)


    //Comparison operator
    val isEqual = 5==3
   // print("isEqual is $isEqual") //isEqual is false
    println("is5greater3 ${5 > 3}") //is5greater3 true
    println("is5lowerEqual3 ${5 <= 3}")  //is5lowerEqual3 false


    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")

    //Increment & Decrement operators (++, --)
    myNum++
    println("myNum is $myNum")
    // increments after use
    println("myNum is ${myNum++}")
    // increments before use
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

}
