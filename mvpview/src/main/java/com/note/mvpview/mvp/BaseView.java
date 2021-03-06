package com.note.mvpview.mvp;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.mvpview.mvp.A.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/7/16 17:03
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      17:03    3.0.5           Create
 */
public interface BaseView extends MvpView{


	void showProgress();

	void onCompleted();

	void onError(Throwable e);
}