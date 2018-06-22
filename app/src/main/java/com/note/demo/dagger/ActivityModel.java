package com.note.demo.dagger;

import android.content.Context;

import com.note.demo.dagger.LifeCycle.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.ActivityModel.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 18:26
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      18:26    3.0.5           Create
 */
@Module
public class ActivityModel {
//	@Named("context")
	@PersonForContext
	@Provides
	@PerActivity
	Person providerPersonContext(Context context) {
		return new Person(context);
	}

//	@Named("name") //不同参数创建对象
	@PersonForName
	@Provides
	Person providerPersonName() {
		return new Person("1234");
	}
}
