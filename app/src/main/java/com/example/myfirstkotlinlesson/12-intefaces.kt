package com.example.myfirstkotlinlesson

import android.icu.text.Transliterator

//Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
// What makes them different from abstract classes is that interfaces cannot store state.
// They can have properties, but these need to be abstract or provide accessor implementations

//An interface is defined using the keyword interface:

interface MyInterface {
    fun bar()
    fun foo() {
        // optional body
    }
}

//A class or object can implement one or more interfaces

class Child : MyInterface {
    override fun bar() {
        // body
    }
}

//You can declare properties in interfaces.
// A property declared in an interface can either be abstract or provide implementations for accessors.
// Properties declared in interfaces can't have backing fields,
// and therefore accessors declared in interfaces can't reference them:

interface MyInterface2 {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child2 : MyInterface2 {
    override val prop: Int = 29
}



//INTERFACES INHERITANCE
interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: Transliterator.Position) : Person



//Resolving overriding conflicts
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}
