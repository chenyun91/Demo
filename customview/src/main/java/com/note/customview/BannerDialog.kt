//package com.note.customview
//
//import android.app.Dialog
//import android.content.Context
//import android.content.DialogInterface
//import android.support.annotation.StyleRes
//import android.view.LayoutInflater
//import com.wzdai.fin.R
//import com.wzdai.fin.base.constant.PathUtils
//import com.wzdai.fin.base.constant.URLConstants
//import com.wzdai.fin.databinding.DialogHomeAdBinding
//import com.wzdai.fin.splash.view.BannerEntity
//import com.wzdai.fin.splash.view.BannerViewEntity
//
///**
// * Copyright (C), 2011-2018 掌存宝
// * FileName: com.wzdai.fin.widget.dialog.BannerDialog.java
// * Author: chenyun
// * Email: chenyun@wzdai.com
// * Date: 2018/6/28 17:05
// * Description:
// * History:
// * <Author>      <Time>    <version>    <desc>
// * chenyun      17:05    3.0.5           Create
// */
//class BannerDialog : Dialog {
//    lateinit var mBinding: DialogHomeAdBinding
//
//    constructor(context: Context?) : super(context, R.style.dialog_bottom_style) {
//        init(context)
//    }
//
//    constructor(context: Context, @StyleRes themeResId: Int) : super(context, themeResId) {
//        init(context)
//    }
//
//    constructor(context: Context, cancelable: Boolean, cancelListener: DialogInterface.OnCancelListener?) : super(context, cancelable, cancelListener) {
//        init(context)
//    }
//
//    fun setData(entity: BannerEntity) {
//        viewEntity.entity.set(entity)
//        viewEntity.imageLink.set(URLConstants.BANNER_IMG_PREFIX_URL + entity.imgLink)
//    }
//
//
//    fun init(context: Context?) {
//        setCancelable(false)
//        setCanceledOnTouchOutside(false)
//        mBinding = DialogHomeAdBinding.inflate(LayoutInflater.from(context))
//        setContentView(mBinding.root)
//        mBinding.imageView.setOnClickListener {
//            PathUtils.goWeb(viewEntity.entity.get().link, viewEntity.entity.get().name)
//        }
////        mBinding.tvClose.setOnClickListener {
////            dismiss()
////        }
//        mBinding.viewEntity = viewEntity
//    }
//
//    override fun show() {
//        super.show()
////        Handler().post {
////            setViewPosition()
////        }
//    }
//
////    fun setViewPosition() {
////        val rlLayoutParams = mBinding.rlLayout.layoutParams
////        Log.i("chenyun", "rl_width_height" + rlLayoutParams.width + "----------" + rlLayoutParams.height)
////        val ivParams = mBinding.imageView.layoutParams
////        Log.i("chenyun", "iv_width_height" + ivParams.width + "----------" + ivParams.height)
////        val tvParams = mBinding.tvClose.layoutParams
////        Log.i("chenyun", "tv_width_height" + tvParams.width + "----------" + tvParams.height)
////        mBinding.tvClose.layoutParams = tvParams
////        val location = IntArray(2)
////        mBinding.tvClose.getLocationOnScreen(location) //获取在当前窗口内的绝对坐标,当前activity显示的大小
////        Log.i("chenyun", "tv_width_height" + location[0] + "----------" + location[1])
////        Log.i("chenyun","rootwidth---"+mBinding.root.width+"------"+ mBinding.root.layoutParams.width)
////        Log.i("chenyun","rootheight---"+mBinding.root.height+"------"+ mBinding.root.layoutParams.height)
////        Log.i("chenyun","screen---"+AppUtil.getScreenDisplay(context)[0]+"------"+ AppUtil.getScreenDisplay(context)[1])
////
////
////        val tvBinding=ViewCloseLayoutBinding.inflate(LayoutInflater.from(context))
////
////        Log.i("chenyun","screen---"+AppUtil.getScreenDisplay(context)[0]+"------"+ AppUtil.getScreenDisplay(context)[1])
////        mBinding.tvClose.layout((AppUtil.getScreenDisplay(context)[0]*0.5).toInt(),(AppUtil.getScreenDisplay(context)[0]*0.2).toInt(),(AppUtil.getScreenDisplay(context)[0]*0.5).toInt()+tvParams.width,
////                (AppUtil.getScreenDisplay(context)[0]*0.2).toInt()+tvParams.height)
////    }
//}