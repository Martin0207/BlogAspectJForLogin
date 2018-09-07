package com.martin.blog_aspectjforlogin

import android.app.Application
import com.martin.aspectj_module.AopUtil

/**
 * @author : martin
 * @date : 2018/9/7
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AopUtil.init(this)
    }
}
