package com.example.algorithm

fun mergeSort(arr: IntArray): IntArray{
    if(arr.size<=1)
        return arr

    var mid = arr.size/2
    var left=arr.sliceArray(0 until mid)
    var right = arr.sliceArray(mid until arr.size)

    var sortedLeft= mergeSort(left )
    var sortedRight= mergeSort(right )

    return merge(sortedLeft, sortedRight)

}

fun merge(left: IntArray, right: IntArray): IntArray {
    var merged = mutableListOf<Int>()
    var i = 0
    var j = 0

    while (i < left.size && j < right.size) {

        if (left[i] <= right[j]) {
            merged.add(left[i])
            i++
        } else {
            merged.add(right[j])
            j++
        }
    }

    while (i < left.size) {
        merged.add(left[i])
        i++

    }

    while (j < right.size) {
        merged.add(right[j])
        j++
    }

    return merged.toIntArray()
}

        fun main() {
            val arr = intArrayOf(38, 27, 43, 3, 9, 82, 10)
            println("Original array: ${arr.joinToString()}")
            val sorted = mergeSort(arr)
            println("Sorted array: ${sorted.joinToString()}")
        }


