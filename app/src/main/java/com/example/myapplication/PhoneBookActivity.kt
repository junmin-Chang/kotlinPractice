package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calling)

        val phoneBook = createFakePhoneBook(30)
        createPhoneBookList(phoneBook)


    }

    fun createFakePhoneBook(fakeNumber: Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook {
        for (i in 0 until fakeNumber) {

            phoneBook.addPerson(Person("" + i + "번째 사람", "" + i + "번째 사람의 전화번ho"))
        }
        return phoneBook
    }





    fun createPhoneBookList(phoneBook: PhoneBook) {
        val layoutInflater = LayoutInflater.from(this@PhoneBookActivity)
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)
            for (i in 0 until phoneBook.personList.size){

                val view = layoutInflater.inflate(R.layout.people, null)
               val personNameView = view.findViewById<TextView>(R.id.person_name)
                personNameView.setText(phoneBook.personList.get(i).name)

                addSetOnClickListener(phoneBook.personList.get(i), view)

                container.addView(view)



            }
    }

    fun addSetOnClickListener(person: Person, view: View) {
        view.setOnClickListener {
            val intent = Intent(this@PhoneBookActivity, PhoneBookDetailActivity::class.java)
            intent.putExtra("name", person.name)
            intent.putExtra("number", person.number)
            startActivity(intent)
        }
    }
}



class PhoneBook() {
    // 전화번호부
    val personList = ArrayList<Person>()

    fun addPerson(person: Person) {
        personList.add(person)

    }
}


class Person(val name: String, val number: String) {

}