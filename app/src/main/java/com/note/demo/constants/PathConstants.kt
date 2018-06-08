package com.note.demo.constants

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.constants.PathConstants.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/8 14:37
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      14:37    3.0.5           Create
 */
object PathConstants {

    const val ArouterMainActivity = "/com/note/demo/ArouterMainActivity"









    const val testName = "ZhangSan"
    //普通变量
    const val constNameNormal: String = "constNameNormal$testName"
    val nameNormal: String = "nameNormal$testName"

    //object
    object MyObject {
        const val constNameObject: String = "constNameObject"
        val nameObject: String = "nameObject"
    }

    //companion object
    class MyClass {
        companion object {
            const val constNameCompanionObject: String = "constNameCompanionObject"
            val nameCompanionObject: String = "nameCompanionObject"
            fun getName(){}
        }
        //object
        object MyObject {
            const val constNameObject: String = "constNameObject"
            val nameObject: String = "nameObject"
            fun getName(){}
        }

    }
}