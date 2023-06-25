package com.example.myfirstkotlinlesson

//All classes in Kotlin have a common superclass,
// Any, which is the default superclass for a class with no supertypes declared:

class Example // Implicitly inherits from Any

//Any has three methods:
// equals(), hashCode(), and toString(). Thus, these methods are defined for all Kotlin classes.

//open class Base // Class is open for inheritance

//By default, Kotlin classes are final – they can't be inherited.
// To make a class inheritable, mark it with the open keyword:

open class Base(p: Int)

class Derived(p: Int) : Base(p)

//To declare an explicit supertype, place the type after a colon in the class header:
//If the derived class has a primary constructor,
// the base class can (and must) be initialized in that primary constructor according to its parameters.

//Kotlin requires explicit modifiers for overridable members and overrides:
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}
//The override modifier is required for Circle.draw(). If it's missing, the compiler will complain.
// If there is no open modifier on a function, like Shape.fill(),
// declaring a method with the same signature in a subclass is not allowed, either with override or without it.
// The open modifier has no effect when added to members of a final class – a class without an open modifier.

//A member marked override is itself open, so it may be overridden in subclasses.
// If you want to prohibit re-overriding, use final:

open class Rectangle() : Shape() {
  final override fun draw() { /*...*/ }
}