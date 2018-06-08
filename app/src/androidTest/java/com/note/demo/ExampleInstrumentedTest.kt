package com.note.demo


import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented com.note.demo.TestClass, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under com.note.demo.TestClass.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("note.com.demo", appContext.packageName)
    }
}
