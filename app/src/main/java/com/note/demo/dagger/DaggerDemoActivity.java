package com.note.demo.dagger;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.note.demo.R;

import javax.inject.Inject;

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dagger.DaggerDemoActivity.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/20 15:31
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      15:31    3.0.5           Create
 */
public class DaggerDemoActivity extends Activity {

//	@Named("context")
	@PersonForContext
	@Inject
	Person person;
//	@Named("context")
	@PersonForContext
	@Inject
	Person person1;

//	@Named("name")
	@PersonForName
	@Inject
	Person person2;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		MainComponent component = DaggerMainComponent.builder().modelClass(new ModelClass(this)).build();
//		component.inject(this);
//		Log.d("chenyun", person.toString() + "-----------" + person1.toString()+"\nperson2"+person2.toString());


		AppComponent appComponent = DaggerAppComponent.builder().appModel(new AppModel(this)).build();
		DaggerActivityComponent.builder().appComponent(appComponent)
				.activityModel(new ActivityModel()).build().inject(this);
	}
}

//class DaggerDemoActivity : Activity() {
//
//@Inject
//		internal var person: Person? = null
//
//				override fun onCreate(savedInstanceState: Bundle?) {
//				super.onCreate(savedInstanceState)
//				val component = DaggerMainComponent.builder().modelClass(ModelClass()).build()
//				component.inject(this)
//				}
//				}