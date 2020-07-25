package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

class AddViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)



        // 아이템 리스트 준
        val carlist = ArrayList<CarForList>()
        for (i in 0 until 10) {

            carlist.add(CarForList("" + i + " 번째 자동차", "" + i + "순위 엔"))
        }
        val container = findViewById<LinearLayout>(R.id.addview_container)
        val inflater = LayoutInflater.from(this@AddViewActivity)

        for (i in 0 until carlist.size) {
            val itemView = inflater.inflate(R.layout.item_view, null)
            val carNameView = itemView.findViewById<TextView>(R.id.car_name)
            val carEngineView = itemView.findViewById<TextView>(R.id.car_engine)

            carNameView.setText(carlist.get(i).name)
            carEngineView.setText(carlist.get(i).engine)
            container.addView(itemView)
        }



    }


}

class CarForList(val name: String, val engine: String) {

}