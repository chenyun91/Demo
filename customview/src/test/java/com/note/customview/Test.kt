package com.note.customview

import android.text.TextUtils
import org.junit.Test

internal class Test{
    @Test
    fun test(){
        System.out.print((parseDouble("157.17") + (16.54)).toString()+"元")
    }


    fun parseDouble(num: String): Double {
        if (TextUtils.isEmpty(num)) return 0.0
        try {
            return java.lang.Double.parseDouble(num)
        } catch (e: Exception) {
            return 0.0
        }

    }
}
