package com.example.myfirstkotlinlesson

fun main() {

//lateinit
    //degiskenleri tanimladigimiz zaman degilde sonra baslatmamiz gerektigi durumlarda leteinit kullanilir.
    //Ama eger sonra baslatmazsak hata verecektir.

    class car(){

        lateinit var owner : String
        init {
            this.owner = "Selvi"
        }
    }
// SETTERS AND GETTERS

    // User class with a Primary constructor that accepts
// three parameters
    class Car1(_brand: String, _model: String, _maxSpeed: Int) {
        // Properties of User class
        val brand: String = _brand         // Immutable (Read only)
        var model: String = _model  // Mutable
        var maxSpeed: Int = _maxSpeed       // Mutable
    }

// Kotlin internally generates a default getter and setter for mutable properties,
// and a getter (only) for read-only properties.

    //   It calls these getters and setters internally whenever
// you access or modify a property using the dot(.) notation.
    // This is how it would look like internally

    class Car2(_brand: String, _model: String, _maxSpeed: Int) {
        val brand: String = _brand
            get() = field

        var model: String = _model
            get() = field
            set(value) {
                field = value
            }

        var maxSpeed: Int = _maxSpeed
            get() = field
            set(value) {
                field = value
            }
    }

// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you’re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user. name = "Elon Musk",
// the value parameter contains the assigned value "Elon Musk".

// 2. Backing Field (field)
// Backing field helps you refer to the property
// inside the getter and setter methods.
// This is required because if you use the property
// directly inside the getter or setter then you’ll
// run into a recursive call which will generate
// a StackOverflowError.


    val maxSpeed = 200

    class Car() {

        lateinit var owner: String

        val myBrand: String = "BMW"
            // Custom getter
            get() {
                return field.toLowerCase()
            }


        // default setter and getter
        var myModel: String = "M5"
            private set

        var myMaxSpeed: Int = maxSpeed
            get() = field
            // Custom Setter
            set(value) {
                field =
                    if (value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
            }

        init {
            this.myModel = "M3"
            this.owner = "Frank"
        }
    }
}

