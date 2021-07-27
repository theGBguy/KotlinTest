package com.thegbguy.kotlintest

open class Car(val brand: String) {
    open fun printCarInfo() = println("This car is of brand $brand")

    fun printCarId() = println("Car id is ${this.javaClass.hashCode()}")
}

class Toyota : Car("Toyota"){
    override fun printCarInfo() = println("Overriden - This car is of brand Toyota")
}

fun main(){
    val newCar: Car = Toyota()
    newCar.printCarInfo()

    val newCarLatest = Car("Toyota")
    newCarLatest.printCarInfo()

    newCar.printCarId()
    newCarLatest.printCarId()
}