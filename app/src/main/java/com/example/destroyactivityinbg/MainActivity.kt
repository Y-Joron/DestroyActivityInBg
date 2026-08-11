package com.example.destroyactivityinbg

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val buttonGoToActivityA = findViewById<Button>(R.id.button_go_to_activityA)
        buttonGoToActivityA.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityA::class.java)
            startActivity(intent)
        }
    }
}