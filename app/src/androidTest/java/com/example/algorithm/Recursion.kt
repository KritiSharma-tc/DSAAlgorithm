package com.example.algorithm

fun factorial(n: Int): Int {
    var i = n
    var result = 1

    while (i > 1) {
        result *= i
        i--
    }
    return result
}

fun main() {
    val num = 5
    println("Factorial of $num using while loop = ${factorial(num)}")
}