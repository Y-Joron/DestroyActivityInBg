package com.example.destroyactivityinbg

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("ActB", "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActB", "onDestroy")
    }
}