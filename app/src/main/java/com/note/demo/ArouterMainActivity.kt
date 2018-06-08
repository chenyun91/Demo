package com.note.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.note.demo.constants.PathConstants

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.ArouterMainActivity.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/6/8 12:24
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      12:24    3.0.5           Create
 */
@Route(path = PathConstants.ArouterMainActivity)
class ArouterMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.arouter_main_activity)


    }
    fun main(args:ArrayList<String>){
        System.out.print(PathConstants.nameNormal)
        System.out.print(PathConstants.constNameNormal)
        PathConstants.MyObject.constNameObject
        PathConstants.MyObject.nameObject
        System.out.print(PathConstants.MyClass.constNameCompanionObject)
        System.out.print(PathConstants.MyClass.nameCompanionObject)
        PathConstants.MyClass.Companion.getName()
        PathConstants.MyClass.MyObject.getName()
        TestClass.A().i
        TestClass().B().i
        TestClass.getName()
    }

}