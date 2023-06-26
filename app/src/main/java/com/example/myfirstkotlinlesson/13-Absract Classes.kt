package com.example.myfirstkotlinlesson

//A class may be declared abstract, along with some or all of its members
// An abstract member does not have an implementation in its class.
// You don't need to annotate abstract classes or functions with open.

abstract class Polygon {
    abstract fun draw()
}

class Rectangle1 : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}

//You can override a non-abstract open member with an abstract one
open class Polygon1 {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : Polygon() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}
