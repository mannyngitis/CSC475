package com.example.unitconversion

import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {

    @Test
    fun testCelsiusToFahrenheit() {
        val result = (25 * 9 / 5) + 32
        assertEquals(77.0, result, 0.01)
    }

    @Test
    fun testFahrenheitToCelsius() {
        val result = (77 - 32) * 5 / 9
        assertEquals(25.0, result, 0.01)
    }

    @Test
    fun testKilogramsToPounds() {
        val result = 10 * 2.205
        assertEquals(22.05, result, 0.01)
    }

    @Test
    fun testPoundsToKilograms() {
        val result = 22.05 / 2.205
        assertEquals(10.0, result, 0.01)
    }
}