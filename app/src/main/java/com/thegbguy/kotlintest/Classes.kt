package com.thegbguy.kotlintest

fun main(){
    val stud = Student()
    val stud1 = Student1(1, "First")
    val stud2 = Student2(2, "Second")

    println("Students details: \nRoll: ${stud1.roll}\nPosition: ${stud1.position}")

    stud2.printStudentDetails()
}

// simple student class without class variables, constructors and body
class Student

// simple student class without body
class Student1(val roll: Int, var position: String)

// proper student class
class Student2(val roll: Int, var position: String){
    fun printStudentDetails() = println("Students details: \nRoll: $roll\nPosition: $position")
}

