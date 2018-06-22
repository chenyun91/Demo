package com.note.demo.dagger

import android.content.Context
import android.util.Log

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.Person.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 10:38
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      10:38    3.0.5           Create
 */
class Person {
    val name: String? = null
    val age: Int? = null
    var mContext: Context? = null


//    @Inject

    constructor(context: Context) {
        mContext = context
        Log.i("chenyun", "-------------new person-------------")
    }

    constructor(name: String) {
        Log.i("chenyun","--------name"+name)
    }
}