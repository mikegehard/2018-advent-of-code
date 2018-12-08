package com.github.mikegehard.adventOfCode2018

import com.github.mikegehard.adventOfCode2018.Day1.calibrationPoint
import com.github.mikegehard.adventOfCode2018.Day1.frequencyChangeFor
import kotlin.test.Test
import kotlin.test.assertEquals

class Day1Test {
    @Test fun testCalculatingFrequencyChange() {
        assertEquals(3, frequencyChangeFor(listOf(1, 1, 1)))
        assertEquals(0, frequencyChangeFor(listOf(1, 1, -2)))
    }

    @Test fun calculatingCalibraionPoint() {
        assertEquals(1, calibrationPoint(listOf(1, -1)))
        assertEquals(10, calibrationPoint(listOf(3, 3, 4, -2, -4)))
        assertEquals(5, calibrationPoint(listOf(-6, 3, 8, 5, -6)))
    }
}
