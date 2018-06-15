package com.note.demo.annotation;

import java.lang.annotation.Repeatable;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.annotation.MyAnnotation.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/12 11:05
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      11:05    3.0.5           Create
 */

@Repeatable(Authorities.class)
@interface Authority {
	String role();
}

@interface Authorities {
	Authority[] value();
}


