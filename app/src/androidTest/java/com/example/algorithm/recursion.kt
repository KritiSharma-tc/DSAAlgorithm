package com.example.algorithm

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()

    val result = factorial(num)
    println("Factorial of $num = $result")
}

fun factorial(n: Int): Int {
    return if (n == 0 || n == 1)
        1
    else
        n * factorial(n - 1)
}