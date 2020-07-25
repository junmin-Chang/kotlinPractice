package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + "번째 car", "" + i + "순위 engine"))
        }

        val adapter = ListViewAdapter(carList, this@ListViewActivity)


        listView.adapter = adapter

    }
}
class ListViewAdapter(val carForList: ArrayList<CarForList>, val context: Context) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_view, null)
        val carNameTextview = view.findViewById<TextView>(R.id.car_name)
        val carEngineTextview = view.findViewById<TextView>(R.id.car_engine)


        carEngineTextview.setText(carForList.get(p0).engine)
        carNameTextview.setText(carForList.get(p0).name)


        return view

    }

    override fun getItem(p0: Int): Any {
        //그리고자 하는 아이템 리스트의 하나(p0에 해당하)
       return carForList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        // 해당 포지션에 위치해 있는 아이템뷰의 아이디 setting
        return p0.toLong()
    }

    override fun getCount(): Int {
        //그리고자 하는 아이템 리스트의 전체 갯수
        return carForList.size
    }
}