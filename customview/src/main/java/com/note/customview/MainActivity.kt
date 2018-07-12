package com.note.customview

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.MarginLayoutParams
import android.widget.Button
import android.widget.RelativeLayout
import java.math.BigDecimal


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btn: Button? = null
    //    private var iv: ImageView? = null
    private var ll_group: RelativeLayout? = null
    var isFullScreen = true
    lateinit var iView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }


    fun parseDouble(num: String): Double {
        if (TextUtils.isEmpty(num)) return 0.0
        try {
            return java.lang.Double.parseDouble(num)
        } catch (e: Exception) {
            return 0.0
        }

    }

    private fun initView() {
        btn = findViewById<View>(R.id.btn) as Button
//        iv = findViewById<View>(R.id.iv) as ImageView
        ll_group = findViewById<View>(R.id.ll_group) as RelativeLayout?

        btn!!.setOnClickListener(this)
        Handler().post {
            val statusBar = findViewById<View>(android.R.id.statusBarBackground)
        }
    }

    override fun onClick(v: View?) {
        val statusBar = findViewById<View>(android.R.id.statusBarBackground)

        if (isFullScreen) { // 全屏转半屏
            setViewSize();
            isFullScreen = false;
        } else {
            isFullScreen = true;
            setViewFullScreen();

        }
        Log.i("chenyun", (157.17 + (16.54)).toString() + "元")
        Log.i("chenyun", add(157.17, 16.54).toString() + "元")
        Log.i("chenyun", "result======" + formatSize(100L, 100L))
        Log.i("chenyun", "result======" + formatSize(123L, 235646L))
        Log.i("chenyun", "result======" + formatSize(100L, -100L))
        Log.i("chenyun", "result======" + formatSize(100L, 0L))
    }

    /**
     * long除法
     *
     * @return
     */
    fun formatSize(long1: Long, long2: Long): Double {
        if (long1 <= 0 || long2 <= 0) return 0.0
        var result = 0.0
        try {
            result = long1 / long2.toDouble()
        } catch (e: Exception) {
            return 0.0
        }
        return result
    }

    fun add(v1: Double, v2: Double): Double {
        val b1 = BigDecimal(v1.toString())
        val b2 = BigDecimal(v2.toString())
        return b1.add(b2).toDouble()
    }

    /**
     * 设置view的大小
     *
     * @param iv2
     */
    private fun setViewFullScreen() {
//        val margin = MarginLayoutParams(view!!.getLayoutParams())
        val layoutParams = iView.layoutParams
        layoutParams.width = 1000
        layoutParams.height = 800
        iView!!.setLayoutParams(layoutParams)
    }

    /**
     * 自定义设置位置及其大小
     *
     * @param iv2
     */
    private fun setViewSize() {
        iView = LayoutInflater.from(this@MainActivity).inflate(R.layout.image_view_layout, null, false)
        ll_group!!.addView(iView)
        val margin = MarginLayoutParams(iView!!.getLayoutParams())
        val dpTop = dp2px(200f)
        val dpRight = dp2px(100f)
        val dpLeft = dp2px(50f)

        margin.setMargins(dpLeft, dpTop, dpRight, 0)

//        val metric = DisplayMetrics()
//        windowManager.defaultDisplay.getMetrics(metric)
//
//
        val layoutParams = RelativeLayout.LayoutParams(margin)
//        layoutParams.width = 100
//        layoutParams.height = 100
        iView!!.setLayoutParams(layoutParams)
    }

    fun dp2px(dpValue: Float): Int {
        val scale = this@MainActivity.resources.displayMetrics.density

        return (dpValue * scale + 0.5f).toInt()
    }
}
