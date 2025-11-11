package com.example.algorithm

fun main() {
    print("Enter amount: ")
    var amount = readLine()!!.toInt()

    val coins = intArrayOf(25, 10, 5, 1)
    val result = mutableListOf<Int>()

    for (coin in coins) {
        while (amount >= coin) {
            amount -= coin
            result.add(coin)
        }
    }

    println("Coins used: $result")
    println("Total coins needed: ${result.size}")
}
