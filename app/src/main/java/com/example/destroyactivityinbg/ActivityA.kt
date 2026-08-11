package com.example.destroyactivityinbg

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("ActA", "onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActA", "onDestroy")
    }
}