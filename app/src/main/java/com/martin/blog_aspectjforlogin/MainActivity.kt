package com.martin.blog_aspectjforlogin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.martin.aspectj_module.AopUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        AopUtil.init(this)
        init()
    }

    private fun init() {
        switch_login.setOnCheckedChangeListener { buttonView, isChecked ->
            AopUtil.getInstance().isLogin = isChecked
        }
        btn_jump.setOnClickListener {
            jump()
        }
    }

    fun jump() {
        when (rg_tip.checkedRadioButtonId) {
            R.id.rb_tip_no_response -> {
                SecondActivity.startNoResponse(this)
            }
            R.id.rb_tip_toast -> {
                SecondActivity.startToast(this)
            }
            R.id.rb_tip_dialog -> {
                SecondActivity.startDialog(this)
            }
            else -> {
            }
        }
    }
}
