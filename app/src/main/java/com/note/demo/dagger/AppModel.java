package com.note.demo.dagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.AppModel.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 18:22
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      18:22    3.0.5           Create
 */
@Module
public class AppModel {
	private Context mContext;

	public AppModel(Context context) {
		mContext = context;
	}

	@Provides
	Context providersContext() {
		return mContext;
	}
}
