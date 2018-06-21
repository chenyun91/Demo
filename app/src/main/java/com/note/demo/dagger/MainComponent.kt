package com.note.demo.dagger

import dagger.Component
import javax.inject.Singleton

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.MainComponent.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 10:40
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      10:40    3.0.5           Create
 */
@Component(modules = [(ModelClass::class)])
@Singleton
interface MainComponent {
    fun inject(activity: DaggerDemoActivity?)
}