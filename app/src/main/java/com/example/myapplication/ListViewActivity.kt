package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + "번째 car", "" + i + "순위 engine"))
        }

        val adapter = ListViewAdapter(carList, this@ListViewActivity, layoutInflater)


        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, p0, id ->
            val carName = (adapter.getItem(p0) as CarForList).name
            val carEngine = (adapter.getItem(p0) as CarForList).engine

            Toast.makeText(this@ListViewActivity, carName + "" + carEngine, Toast.LENGTH_SHORT).show()
        }


    }
}

class ListViewAdapter(val carForList: ArrayList<CarForList>, val context: Context, val layoutInflater: LayoutInflater) : BaseAdapter() {
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val view: View
        val holder: ViewHolder

        if (p1 == null) {
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        } else {
            holder = p1.tag as ViewHolder
            view = p1
        }

        holder.carName?.setText(carForList.get(p0).name)
        holder.carEngine?.setText(carForList.get(p0).engine)


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


class ViewHolder() {
    var carName: TextView? = null
    var carEngine: TextView? = null
}