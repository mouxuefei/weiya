package com.huaxi.syndromeplatfrom.view

import com.exmple.corelib.mvp.MBaseMvpActivity
import com.huaxi.syndromeplatfrom.R
import com.huaxi.syndromeplatfrom.contract.ISplashContract
import com.huaxi.syndromeplatfrom.presenter.SplashPresenter
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * @describe
 * @author  mou
 * @date 2020/5/6  19:57
 * 								 - generate by MvpAutoCodePlus plugin.
 */

class SplashActivity : MBaseMvpActivity<ISplashContract.View, ISplashContract.Presenter>(), ISplashContract.View {
    override fun getContentView()= R.layout.activity_splash

    override fun initView() {
//        LibApplication.appHandler?.postDelayed({
//            myStartActivity<LoginActivity>()
//        },1000)
        aaaa.setOnClickListener {  }
    }

    override var mPresenter: ISplashContract.Presenter= SplashPresenter()

}

