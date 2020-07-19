package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_assignment_06.*

class assignment_06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_06)


        // new -> old (new + old)
        var new = "0"
        var old = "0"





        number1.setOnClickListener {
            new = new + "1"
            result.setText(new)
        }
        number2.setOnClickListener {
            new = new + "2"
            result.setText(new)

        }
        number3.setOnClickListener {
            new = new + "3"
            result.setText(new)
        }
        number4.setOnClickListener {
            new = new + "4"
            result.setText(new)
        }
        number5.setOnClickListener {
            new = new + "5"
            result.setText(new)
        }
        number6.setOnClickListener {
            new = new + "6"
            result.setText(new)
        }
        number7.setOnClickListener {
            new = new + "7"
            result.setText(new)
        }
        number8.setOnClickListener {
            new = new + "8"
            result.setText(new)
        }
        number9.setOnClickListener {
            new = new + "9"
            result.setText(new)
        }
        number0.setOnClickListener {
            new = new + "0"
            result.setText(new)
        }




        plus.setOnClickListener {

            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            result.setText(old)
        }


        CA.setOnClickListener {

            new = "0"
            old = "0"
            result.setText("0")
        }


    }
}