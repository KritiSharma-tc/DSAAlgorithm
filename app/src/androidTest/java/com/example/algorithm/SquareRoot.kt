package com.example.algorithm

fun main() {
    val x = 64
    var left = 1
    var right = x
    var ans = 0

    while (left <= right) {
        val mid = (left + right) / 2
        if (mid * mid == x) {
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