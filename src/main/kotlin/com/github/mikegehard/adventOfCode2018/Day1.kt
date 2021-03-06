/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.github.mikegehard.adventOfCode2018.Day1

import java.nio.file.Files
import java.nio.file.Paths
import kotlin.streams.toList

fun frequencyChangeFor(changes: List<Int>): Int =
        changes.sum()

fun calibrationPoint(changes: List<Int>): Int {
    var remainingChanges = changes.toMutableList()
    val pastFrequencies = mutableListOf<Int>()

    while (remainingChanges.isNotEmpty()) {
        val lastFrequency = pastFrequencies.lastOrNull() ?: 0

        val newFrequency = lastFrequency + remainingChanges.removeAt(0)

        if (pastFrequencies.contains(newFrequency)){
            return newFrequency
        } else {
            pastFrequencies.add(newFrequency)
        }

        if (remainingChanges.isEmpty()) {
            remainingChanges = changes.toMutableList()
        }
    }

    // To make the compiler happy because you want to loop until you find
    // something. :-)
    return 0

}

fun changesFromFile(filePath: String): List<Int> =
        Files.lines(Paths.get(filePath)).map { it.toInt() }.toList()

fun main() {
    val currentDirectory = Paths.get("").toAbsolutePath()
    val changes = changesFromFile("$currentDirectory/src/main/resources/Day1.txt")
    println("Answer is ${frequencyChangeFor(changes)}")
    println("Calibration point is ${calibrationPoint(changes)}")
}
