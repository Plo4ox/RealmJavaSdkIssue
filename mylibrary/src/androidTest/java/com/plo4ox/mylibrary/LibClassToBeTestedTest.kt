package com.plo4ox.mylibrary

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LibClassToBeTestedTest {
    @Test
    fun testTwoPlusTwo() {
        assertEquals(2, LibClassToBeTested().onePlusOne())
    }
}