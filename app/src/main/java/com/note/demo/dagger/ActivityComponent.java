package com.note.demo.dagger;

import dagger.Component;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.ActivityComponent.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 18:27
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      18:27    3.0.5           Create
 */
@Component(modules = ActivityModel.class,dependencies = AppComponent.class)
public interface ActivityComponent {
	void inject(DaggerDemoActivity activity);
}
