package com.martin.blog_aspectjforlogin

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.martin.aspectj_module.annotation.NeedLogin

class SecondActivity : AppCompatActivity() {

    companion object {
        @NeedLogin(tipType = NeedLogin.NO_RESPONSE,loginActivity = LoginActivity::class )
        fun startNoResponse(context: Context) {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }
        @NeedLogin(tipType = NeedLogin.SHOW_TOAST,loginActivity = LoginActivity::class )
        fun startToast(context: Context) {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }
        @NeedLogin(tipType = NeedLogin.SHOW_DIALOG,loginActivity = LoginActivity::class )
        fun startDialog(context: Context) {
            val intent = Intent(context, SecondActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}
