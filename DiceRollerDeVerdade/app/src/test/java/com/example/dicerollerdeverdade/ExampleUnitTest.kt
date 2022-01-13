package com.example.dicerollerdeverdade

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {

    @Test
    fun generate_number(){
        val dice = Dice(6)
        val rollResult: Int = dice.roll()

        assertTrue(rollResult in 1..6)
    }
}