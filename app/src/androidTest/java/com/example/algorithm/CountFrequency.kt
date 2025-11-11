package com.example.algorithm


fun main() {
    val arr = intArrayOf(1, 2, 2, 3, 4, 1, 4, 2, 5, 3, 3, 4, 3)
    val freq = mutableMapOf<Int, Int>()

    for (num in arr) {
        freq[num] = freq.getOrDefault(num, 0) + 1
    }

    for ((key, value) in freq) {
        println("$key appears $value times")
    }
}