package com.note.demo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.alibaba.android.arouter.launcher.ARouter
import com.note.demo.constants.PathConstants

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
        } else if (id == R.id.btn_arouter) {

        }
        
    }
}