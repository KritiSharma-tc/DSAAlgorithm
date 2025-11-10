package com.example.algorithm

fun maxNum(nums: IntArray): Int {
    var max = nums[0]
    for (i in nums) {
        if (i > max) max = i
    }
    return max
}

fun sumOfArray(nums: IntArray): Int {
    var sum = 0
    for (i in nums) {
        sum += i
    }
    return sum
}

fun main() {
    val nums = intArrayOf(3, 5, 7, 2, 8)
    println("Maximum number: ${maxNum(nums)}")

    print("Final number from array : ")
    for(i in nums){
        print("$i")
    }
    println(" ")
    println("Sum of number = ${sumOfArray(nums)}")

}