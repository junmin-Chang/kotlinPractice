package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_phone_book_detail.*

class PhoneBookDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_detail)


        getPersonInfoAndDraw()


        back.setOnClickListener {
            onBackPressed()
        }

    }





    fun getPersonInfoAndDraw() {
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")

        person_detail_name.text = name
        person_detail_number.text = number
    }
}