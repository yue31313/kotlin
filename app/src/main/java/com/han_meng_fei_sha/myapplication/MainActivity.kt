package com.han_meng_fei_sha.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
//import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import kotlinx.android.synthetic.main.layout.*

//import com.han_meng_fei_sha.myapplication.R.id.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        textView.setText("测试文字")
                textView.setOnClickListener { v -> Toast.makeText(applicationContext, "Lambda", Toast.LENGTH_LONG).show() }
    }
}
