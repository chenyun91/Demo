package com.note.mvpview.mvp;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.mvpview.mvp.Mvp.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/7/16 17:00
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      17:00    3.0.5           Create
 */
public interface MvpPresenter<V extends MvpView> {

	/**
	 * Set or attach the view to this presenter
	 */
	public void attachView(V view);

	/**
	 * Will be called if the view has been destroyed. Typically this method will be invoked from
	 * <code>Activity.detachView()</code> or <code>Fragment.onDestroyView()</code>
	 */
	public void detachView(boolean retainInstance);
}
