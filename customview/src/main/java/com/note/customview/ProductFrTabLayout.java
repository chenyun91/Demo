package com.note.customview;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.wzdai.fin.widget.tabview.ProductFrTabLayout.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/7/3 15:35
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:35    3.0.5           Create
 */
public class ProductFrTabLayout extends TabLayout {

	private Context mContext;

	public ProductFrTabLayout(Context context) {
		super(context);
		init(context);
	}

	public ProductFrTabLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	public ProductFrTabLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init(context);
	}

	private void init(Context context) {
		mContext = context;
		setTabTextColors(ContextCompat.getColor(mContext, R.color.color_333333), ContextCompat.getColor(mContext, R.color.color_de3030));
		setSelectedTabIndicatorColor(ContextCompat.getColor(mContext, R.color.color_de3030));
//		setupWithViewPager();
	}

}
