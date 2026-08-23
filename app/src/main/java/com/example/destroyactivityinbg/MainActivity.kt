package com.example.destroyactivityinbg

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainAct", "onCreate")
        setContentView(R.layout.main_activity)

        val buttonGoToActivityA = findViewById<Button>(R.id.button_go_to_activityA)
        buttonGoToActivityA.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityA::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainAct", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainAct", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainAct", "onDestroy")
        if (isFinishing) {
            ActivityA.finishIfAlive()
        }
    }
}