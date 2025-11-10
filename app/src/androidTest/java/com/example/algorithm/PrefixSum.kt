package com.example.algorithm

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val prefix = IntArray(arr.size)

    prefix[0] = arr[0]

    for (i in 1 until arr.size) {
        prefix[i] = prefix[i - 1] + arr[i]
    }

    println("Original array: ${arr.joinToString()}")
    println("Prefix sum array: ${prefix.joinToString()}")
}