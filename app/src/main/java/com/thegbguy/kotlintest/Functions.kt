package com.thegbguy.kotlintest

// a starter program
fun main() {
    printMsg("Just getting started")
    println(sum(2, 3))

    greetUser("Chiranjeevi")
    greetUser("Chiranjeevi", "Good Evening")
    greetUser(greeting = "Good Afternoon", userName = "Foo")

    testInfix("Hello World! ")
    createpair()

    powerfulInfixTest()
    operatorFunctionTest()

    variableArgsTest("Hello", "World", "I", "am", "good")
}

// a simple function which takes String as parameter and returns nothing(Unit)
fun printMsg(msg: String) {
    println(msg)
}

// a simple function which takes to integers as parameter and returns
// an integer(inferred type) which is their sum
fun sum(a: Int, b: Int) = a + b

// another simple function to learn concept of named and default parameters
fun greetUser(userName: String, greeting: String = "Hello") = println("$greeting $userName")

// infix function test
fun testInfix(str: String) {
    infix fun Int.times(str: String) = str.repeat(this)
    println(3 times "Hello World! ")
}

//builtin infix function
fun createpair() {
    // "to" to create pair/tuples
    val pair = "John" to "Melina";
    println(pair)
}

// likes infix function test
fun powerfulInfixTest() {
    val person1 = Person("Ram")
    val person2 = Person("Sita")
    person1 likes person2
    println(person1.likedList.size)
}

// a sample class to make use of our new likes infix function
class Person(name: String) {
    val likedList = mutableListOf<Person>();
    infix fun likes(other: Person) {
        likedList.add(other);
    }
}

// a sample function to test operator function
fun operatorFunctionTest() {
    operator fun Int.times(str: String) = str.repeat(this)
    println(5 * "\nThis stuff is being printed 5 times.")
}

// a sample method to test variable arguments in kotlin
fun variableArgsTest(vararg str: String) {
    // printing the args using for each loop
    for (s in str)
        println(s)

    // passing the varargs as varargs using spread operator
    // otherwise it will be an array<string> inside
    printAll(*str)

}

fun printAll(vararg args: String) {
    val className = args.javaClass.simpleName
    println("variable args is of type : $className")
}



