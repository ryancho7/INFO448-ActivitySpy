package edu.uw.ischool.ryancho7.activityspy

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        if(savedInstanceState != null) {
            Log.i(TAG,"onCreate event fired with savedInstanceState: $savedInstanceState")
        } else {
            Log.i(TAG,"onCreate event fired with no savedInstanceState")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume event fired")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }
}