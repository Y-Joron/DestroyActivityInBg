package com.example.destroyactivityinbg

import android.app.PictureInPictureParams
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.d("ActA", "onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ActA", "onResume isInPictureInPictureMode: $isInPictureInPictureMode")
        findViewById<TextView>(R.id.text_is_in_pip).text = "is pip = $isInPictureInPictureMode"
    }

    override fun onPause() {
        super.onPause()
        Log.d("ActA", "onPause isInPictureInPictureMode: $isInPictureInPictureMode")
        findViewById<TextView>(R.id.text_is_in_pip).text = "is pip = $isInPictureInPictureMode"
    }

    override fun onStop() {
        super.onStop()
        Log.d("ActA", "onStop isInPictureInPictureMode: $isInPictureInPictureMode")
        findViewById<TextView>(R.id.text_is_in_pip).text = "is pip = $isInPictureInPictureMode"
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActA", "onDestroy isInPictureInPictureMode: $isInPictureInPictureMode")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        val pictureInPictureParamsBuilder = PictureInPictureParams.Builder()
        enterPictureInPictureMode(pictureInPictureParamsBuilder.build())
    }
}