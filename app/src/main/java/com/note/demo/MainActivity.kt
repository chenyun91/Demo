package com.note.demo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.alibaba.android.arouter.launcher.ARouter
import com.note.demo.binding.DataBindingMainActivity
import com.note.demo.constants.PathConstants
import com.note.demo.dagger.DaggerDemoActivity
import note.com.apt_lib.AutoCreat

//TODO  AutoCreat自定义注解 gradle 2.3运行成功，3.0运行失败
@AutoCreat
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn_arouter)

    }

    fun clickArouter(view: View) {
        val id = view.id
        if (id == R.id.btn_arouter) {
            ARouter.getInstance().build(PathConstants.ArouterMainActivity).navigation()
        } else if (id == R.id.btn_dagger2) {
            startActivity(Intent(this@MainActivity, DaggerDemoActivity::class.java))
        } else if (id == R.id.btn_databinding) {
            startActivity(Intent(this@MainActivity, DataBindingMainActivity::class.java))
        }

    }
}