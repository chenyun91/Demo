package com.note.mvpview.mvp;

import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.mvpview.mvp.Base.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/7/16 17:02
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      17:02    3.0.5           Create
 */
public class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

	private WeakReference<V> viewRef;

	@Override public void attachView(V view) {
		viewRef = new WeakReference<V>(view);
	}

	/**
	 * Get the attached view. You should always call {@link #isViewAttached()} to check if the view
	 * is
	 * attached to avoid NullPointerExceptions.
	 *
	 * @return <code>null</code>, if view is not attached, otherwise the concrete view instance
	 */
	@Nullable
	public V getView() {
		return viewRef == null ? null : viewRef.get();
	}

	/**
	 * Checks if a view is attached to this presenter. You should always call this method before
	 * calling {@link #getView()} to get the view instance.
	 */
	public boolean isViewAttached() {
		return viewRef != null && viewRef.get() != null;
	}

	@Override public void detachView(boolean retainInstance) {
		if (viewRef != null) {
			viewRef.clear();
			viewRef = null;
		}
	}
}