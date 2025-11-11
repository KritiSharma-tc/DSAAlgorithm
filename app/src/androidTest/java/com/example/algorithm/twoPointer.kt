package com.example.algorithm

fun main() {
    val arr = intArrayOf(3, 2, 6, 4, 6, 7, 9)
    val target = 9

    var left = 0                // Start pointer
    var right = arr.size - 1    // End pointer
    var found = false

    while (left < right) {
        val sum = arr[left] + arr[right]

        if (sum == target) {
            println("Pair found: (${arr[left]}, ${arr[right]})")
            found = true
            break
        } else if (sum < target) {
            left++
        } else {
            right--
        }
    }

    if (!found) println("No pair found with sum $target")
}