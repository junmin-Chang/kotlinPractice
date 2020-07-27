package com.example.myapplication

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
        val phoneBookRecyclerAdapter = PhoneBookRecyclerAdapter(phoneBook, LayoutInflater.from(this@PhoneBookWithRecyclerViewActivty))
        phonebook_recycler_view.adapter = phoneBookRecyclerAdapter

        phonebook_recycler_view.layoutManager = LinearLayoutManager(this@PhoneBookWithRecyclerViewActivty)

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
    val inflater : LayoutInflater
): RecyclerView.Adapter<PhoneBookRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val personName : TextView

        init {
            personName = itemView.findViewById<TextView>(R.id.person_name)
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


