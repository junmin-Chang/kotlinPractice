package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_phone_book_with_recycler_view_activty.*
import org.w3c.dom.Text



class PhoneBookWithRecyclerViewActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_with_recycler_view_activty)


        val phoneBook = createFakePhoneBook(30)
        val phoneBookRecyclerAdapter = PhoneBookRecyclerAdapter(phonebookList = phoneBook, inflater = LayoutInflater.from(this@PhoneBookWithRecyclerViewActivty), activity = this)
        phonebook_recycler_view.adapter = phoneBookRecyclerAdapter

        phonebook_recycler_view.layoutManager = LinearLayoutManager(this@PhoneBookWithRecyclerViewActivty)


//
//        with(phonebook_recycler_view) {
//            this.adapter = PhoneBookRecyclerAdapter(
//                phonebookList = phoneBook,
//                inflater = LayoutInflater.from(this@PhoneBookWithRecyclerViewActivty),
//                activity = this@PhoneBookWithRecyclerViewActivty)
//
//            this.layoutManager = LinearLayoutManager(this@PhoneBookWithRecyclerViewActivty)
//        }

    }



    fun createFakePhoneBook(fakeNumber: Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook {
        for (i in 0 until fakeNumber) {

            phoneBook.addPerson(Person("" + i + "번째 사람", "" + i + "번째 사람의 전화번ho"))
        }
        return phoneBook
    }



}


class PhoneBookRecyclerAdapter(
    val phonebookList : PhoneBook,
    val inflater : LayoutInflater,
    val activity : Activity
): RecyclerView.Adapter<PhoneBookRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val personName : TextView

        init {
            personName = itemView.findViewById<TextView>(R.id.person_name)
            itemView.setOnClickListener {
                val intent = Intent(activity, PhoneBookDetailActivity::class.java)

                intent.putExtra("name", phonebookList.personList.get(adapterPosition).name)
                intent.putExtra("number", phonebookList.personList.get(adapterPosition).number)


                activity.startActivity(intent)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.people, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return phonebookList.personList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.personName.setText(phonebookList.personList.get(position).name)
    }
}


