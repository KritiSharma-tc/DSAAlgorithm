package com.example.algorithm

fun maxVowels(s: String, k: Int): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0
    var maxCount = 0

    for (i in 0 until k) {
        if (s[i] in vowels) count++
    }
    maxCount = count

    for (i in k until s.length) {
        if (s[i] in vowels) count++
        if (s[i - k] in vowels) count--
        maxCount = maxOf(maxCount, count)
    }

    return maxCount
}

fun main() {
    val s = "abciiidef"

    val k = 4
    
    val result = maxVowels(s, k)
    println("Maximum number of vowels in any substring of length $k: $result")
}
