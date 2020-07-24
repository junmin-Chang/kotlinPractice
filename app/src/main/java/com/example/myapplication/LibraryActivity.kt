package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_library.*

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        Glide.with(this@LibraryActivity)
            .load("https://cafeptthumb-phinf.pstatic.net/20120611_289/kkas_nknk55_1339391180925I3qnD_JPEG/%B0%ED%BE%E7%C0%CC9.jpg?type=w740")
            .centerCrop()
            .into(glide)


        Glide.with(this@LibraryActivity)
            .load("https://cafeptthumb-phinf.pstatic.net/20120611_289/kkas_nknk55_1339391180925I3qnD_JPEG/%B0%ED%BE%E7%C0%CC9.jpg?type=w740")
            .into(glide2)


    }
}