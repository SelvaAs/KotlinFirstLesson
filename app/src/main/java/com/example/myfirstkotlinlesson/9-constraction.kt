package com.example.myfirstkotlinlesson

fun main() {

    class Person constructor(_firstName: String, _lastName: String) {
        // or class Person constructor    (_firstName: String, _lastName: String)

        // Member Variables (Properties) of the class
        var firstName: String
        var lastName: String

        // Initializer Block
        init {
            this.firstName = _firstName
            this.lastName = _lastName

            println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
        }
    }

    // where by John and Doe will be default values
    class People(var firstName: String = "John", var lastName: String = "Doe") {
        // Initializer Block
        init {
            println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
        }
    }
    class Student(var firstName: String, var lastName: String) {
        var age: Int? = null
        var hobby: String = "Watch Netflix"
        var myFirstName = firstName

        // Secondary Constructor
        constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
            this.age =
                if (age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
        }

        fun stateHobby() {
            println("$firstName \'s Hobby is: $hobby'")
        }
    }

   // You can use primary or secondary Constructor to create an object

// Calls the primary constructor (Age will be null in this case)
    val person1 = Person("Denis", "Panjuta")

// Calls the secondary constructor
    val person2 = Student("Elon", "Musk",45)


// Having multiple overloads

    class People1(var firstName: String, var lastName: String) {
        var age: Int? = null
        var eyeColor: String? = null

        // Secondary Constructor
        constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
            this.age =
                if (age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
        }

        // Secondary Constructor
        constructor(firstName: String, lastName: String, age: Int, eyeColor: String) :
                this(firstName, lastName, age) {
            this.eyeColor = eyeColor
        }
    }

}
