package com.lovely.pig.buglyupdate

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.tencent.bugly.beta.Beta

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById(R.id.tv) as TextView
        //  String str=null;
//        val str = "热更新前"
        val str = "3333333热修复后3333"
        tv.text = str
        tv.setOnClickListener {
            Beta.checkUpgrade()
        }
    }

}
