package com.note.demo.dagger.LifeCycle;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.LifeCycle.PerActivity.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/21 16:19
 * Description:Activity 单例生命周期
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      16:19    3.0.5           Create
 */

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
