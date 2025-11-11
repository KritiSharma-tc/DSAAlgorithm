package com.example.algorithm

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    var fact = 1

    for (i in 1..num) {
        fact *= i
    }

    println("Factorial of $num is $fact")
}