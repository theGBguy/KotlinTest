package com.thegbguy.kotlintest

fun main(){
    val result1 = Result(1)
    val result2 = Result("Error msg")

    result1.printResult()
    result2.printResult()
}

// example of generic class
class Result<E>(private val result: E) {
    fun printResult() = println("Result : $result")
}

// example of generic function
fun <E> generateResultInstance(result: E) = Result(result)