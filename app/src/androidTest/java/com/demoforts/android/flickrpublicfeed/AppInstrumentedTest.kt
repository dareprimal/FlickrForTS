package com.demoforts.android.flickrpublicfeed

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class AppInstrumentedTest {
    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getTargetContext()
        val expectedPackage = "com.demoforts.android.flickrpublicfeed"
        assertEquals(expectedPackage, appContext.packageName)
    }
}
