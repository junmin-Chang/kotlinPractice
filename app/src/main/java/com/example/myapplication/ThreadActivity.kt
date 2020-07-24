package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*
import java.lang.Thread

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable: Runnable = object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread is made")
            }
        }
        val thread: Thread = Thread(runnable)

        button_3.setOnClickListener {
            thread.start()
        }


        Thread(object : Runnable {
            override fun run() {
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()


        Thread(Runnable {
            Log.d("thread-1", "Thread3 is made")
            Thread.sleep(10000)
            runOnUiThread {
                button_3.setBackgroundColor(getColor(R.color.textview_color))
            }

        }).start()


    }
}