package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MyTag","MainActivity: onCreated")

        viewListeners()
    }

    private fun viewListeners(){
        val myBtn = findViewById<Button>(R.id.next_btn)
        myBtn.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                val intent = Intent(this@MainActivity,SecondActivity::class.java)
                startActivity(intent)
            }

        })
    }
    override fun onStart() {
        super.onStart()
        Log.i("MyTag","MainActivity: onStarted")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MyTag","MainActivity: onRestarted")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MyTag","MainActivity: onResumed")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyTag","MainActivity: onPaused")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyTag","MainActivity: onStopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyTag","MainActivity: onDestroyed")
    }
}