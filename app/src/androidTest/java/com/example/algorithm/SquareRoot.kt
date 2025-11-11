package com.example.algorithm

fun main() {
    val x = 64
    var left = 1
    var right = x
    var ans = 0

    while (left <= right) {
        val mid = left + (right - left) / 2
        val square = mid * mid
        if (square == x) {
            ans = mid
            break
        } else if (mid * mid < x) {
            ans = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }

    println("Square root of $x = $ans")
}