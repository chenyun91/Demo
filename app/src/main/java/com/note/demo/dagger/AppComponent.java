package com.note.demo.dagger;

import android.content.Context;

import dagger.Component;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.AppComponent.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 18:24
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      18:24    3.0.5           Create
 */
@Component(modules = AppModel.class)
public interface AppComponent {
	Context proContext();
}
