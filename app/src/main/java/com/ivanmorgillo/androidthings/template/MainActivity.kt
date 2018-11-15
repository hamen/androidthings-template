package com.ivanmorgillo.androidthings.template

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.main_activity.midscreen_message

class MainActivity : Activity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val message = "Hello World"
        Log.d("TEMPLATE", message)
        midscreen_message.text = message
    }
}
