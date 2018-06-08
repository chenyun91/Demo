package com.note.demo

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.AppApplication.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/8 16:33
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      16:33    3.0.5           Create
 */
class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEMO_TEST) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(this)
    }
}