package com.plo4ox.realmjavasdkissue

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ClassToBeTestedTest {
    @Test
    fun testTwoPlusTwo() {
        assertEquals(4, ClassToBeTested().twoPlusTwo())
    }
}