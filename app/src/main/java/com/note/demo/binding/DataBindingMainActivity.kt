package com.note.demo.binding

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Spannable
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.note.demo.databinding.ActBindingMainLayoutBinding
import java.util.regex.Pattern

/**
 * Copyright (C), 2011-2018 掌存宝
 * FileName: com.note.demo.dataBinding.DataBindingMainActivity.java
 * Author: chenyun
 * Email: chenyun@wzdai.com
 * Date: 2018/7/11 16:39
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * chenyun      16:39    3.0.5           Create
 */
class DataBindingMainActivity : AppCompatActivity() {
    lateinit var mBinding: ActBindingMainLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActBindingMainLayoutBinding.inflate(LayoutInflater.from(this@DataBindingMainActivity))
        setContentView(mBinding.root)
//        DataBindingUtil.setContentView<ActBindingMainLayoutBinding>(this@DataBindingMainActivity, R.layout.act_binding_main_layout)


//        mBinding.content = "123"
////        mBinding.setVariable(R.id.tv_text,"234")
//        mBinding.activity = this

        val str1 = "《债权转让协议》"
        val str2 = "《出借人居间服务协议》"
        val str3 = "《网络借贷风险及禁止性行为提示》"
        val str4 = "《出借人自动投标授权书》"
        clickSpan(str1)
        clickSpan(str2)
        clickSpan(str3)
        clickSpan(str4)
    }


    fun clickText() {
        Toast.makeText(this@DataBindingMainActivity, "onCLick", Toast.LENGTH_LONG).show()
    }

    fun clickSpan(str:String) {

        val spanStr = SpannableString(mBinding.tvSpan.text)
        val clickSpan = object : ClickableSpan() {
            override fun onClick(widget: View?) {
                Toast.makeText(this@DataBindingMainActivity, str, Toast.LENGTH_LONG).show()
            }

        }

        val pattern = Pattern.compile(str)
        val matcher = pattern.matcher(spanStr)
        if (matcher.find()) {
//            val group = matcher.group()
            spanStr.setSpan(clickSpan, matcher.start(), matcher.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
            spanStr.setSpan(NoUnderlineSpan(), matcher.start(), matcher.end(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            mBinding.tvSpan.text = spanStr
            mBinding.tvSpan.movementMethod = LinkMovementMethod.getInstance()
        }
    }

    class NoUnderlineSpan : UnderlineSpan() {
        override fun updateDrawState(ds: TextPaint) {
            ds.color = Color.parseColor("#de3030")
            ds.isUnderlineText = false
        }
    }
}