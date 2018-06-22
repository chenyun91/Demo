package com.note.demo.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.PersonForContext.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/21 15:07
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:07    3.0.5           Create
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PersonForContext {
}
