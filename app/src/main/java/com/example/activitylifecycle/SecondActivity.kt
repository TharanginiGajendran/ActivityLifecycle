package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        viewListeners()
        Log.i("MyTag","SecondActivity: onCreated")

    }

    private fun viewListeners(){
        val okBtn = findViewById<Button>(R.id.second_btn)
        okBtn.setOnClickListener {
            Toast.makeText(this,"This is Second Activity",Toast.LENGTH_LONG).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MyTag","SecondActivity: onStarted")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag","SecondActivity: onRestarted")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag","SecondActivity: onResumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag","SecondActivity: onPaused")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag","SecondActivity: onStopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag","SecondActivity: onDestroyed")
    }

}