package com.example.destroyactivityinbg

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("ActA", "onCreate")
        findViewById<Button>(R.id.button_go_to_activityB).setOnClickListener {
            val intent = Intent(this@ActivityA, ActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActA", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActA", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActA", "onDestroy")
    }
}