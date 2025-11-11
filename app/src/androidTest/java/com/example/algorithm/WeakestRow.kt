package com.example.algorithm

fun kWeakestRows(matrix: Array<IntArray>, k: Int): IntArray {
    val rowStrength = mutableListOf<Pair<Int, Int>>()  // Pair(rowIndex, soldierCount)

    for (i in matrix.indices) {
        val soldiers = matrix[i].count { it == 1 }
        rowStrength.add(Pair(i, soldiers))
    }
    rowStrength.sortWith(compareBy({ it.second }, { it.first }))

    // Take first k row indexes
    return rowStrength.take(k).map { it.first }.toIntArray()
}

fun main() {
    val mat = arrayOf(
        intArrayOf(1,1,0,0,0),
        intArrayOf(1,1,1,1,0),
        intArrayOf(1,0,0,0,0),
        intArrayOf(1,1,0,0,0),
        intArrayOf(1,1,1,1,1)
    )

    val k = 1

    val weakest = kWeakestRows(mat, k)

    println("The $k weakest rows are: ${weakest.joinToString(", ")}")
}
