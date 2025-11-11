package com.example.algorithm

fun main() {
    val arr = intArrayOf(3, 2, 6, 4, 6, 7, 9)
    arr.sort()
    println("Sorted array: ${arr.joinToString()}")
    val target = 9

    var left = 0
    var right = arr.size - 1
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