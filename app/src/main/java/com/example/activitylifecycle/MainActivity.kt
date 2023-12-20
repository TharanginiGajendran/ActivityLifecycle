package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("CheckActivityLifecycle","MainActivity: onCreated")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CheckActivityLifecycle","MainActivity: onResumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CheckActivityLifecycle","MainActivity: onPaused")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CheckActivityLifecycle","MainActivity: onRestarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CheckActivityLifecycle","MainActivity: onDestroyed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CheckActivityLifecycle","MainActivity: onStopped")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CheckActivityLifecycle","MainActivity: onStarted")
    }
}