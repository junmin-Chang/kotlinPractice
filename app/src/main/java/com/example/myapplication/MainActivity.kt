package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.assignment_05)

        Log.d("Life_Cycle", "onCreate")
    }


    override fun onStart() {
        super.onStart()
        Log.d("Life_Cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_Cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_Cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_Cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_Cycle", "onDestroy")
    }
}