package com.note.demo.dagger

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.ModelClass.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/19 15:50
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:50    3.0.5           Create
 */
@Module
class ModelClass {
    var mContext: Context


    constructor(context: Context) {
        mContext = context
    }

    @Provides
    fun providerContext(): Context {
        return mContext
    }

    @Provides
    @Singleton
    fun providerPerson(context: Context): Person {
        return Person(context)
    }
}