package com.example.algorithm

fun binarySearch(arr: IntArray, target: Int): Int {
    var minIndex = 0
    var maxIndex = arr.size - 1

    while (minIndex <= maxIndex) {
        val mid = (minIndex + maxIndex) / 2

        if (arr[mid] == target) {
            return mid
        } else if (arr[mid] < target) {
            minIndex = mid + 1
        } else {
            maxIndex = mid - 1
        }
    }
    return -1
}

fun main() {
    val numbers = intArrayOf(5, 10, 9, 4, 14, 11, 9)
     numbers.sort()

    for(i in numbers){
        print("$i  ")
    }

    val target = 10

    val result = binarySearch(numbers, target)
    if (result != -1)
        println("Element found at index: $result")
    else
        println("Element not found")
}


