package com.example.myapplication

import FragmentOne
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("Life_Cycle", "onCreate")


        val fragmentOne: FragmentOne = FragmentOne() 

        // 프라그먼트에 data를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello", "Hello")
        fragmentOne.arguments = bundle


        Button.setOnClickListener {
            // 프라그먼트를 동적으로 작동하는 방법

            val fragmentManager = supportFragmentManager


            // Transaction
            // 작업의 단위 --> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragmentOne)
            fragmentTransaction.commit()

            // 끝을 내는 방법
            // commit   ->  시간 될 때 해(좀더 안정적)
            // commitnow    -> 지금 당장해
        }


        Button2.setOnClickListener {

            // 프라그먼트 remove/ detach 하는 방
            val fragmentManager = supportFragmentManager
            val fragmentTransaction2 = fragmentManager.beginTransaction()
            fragmentTransaction2.detach(fragmentOne)
            fragmentTransaction2.commit()
        }
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