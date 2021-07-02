package com.site.contactbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView =findViewById(R.id.recycleview)
        recyclerView.layoutManager =LinearLayoutManager(this,RecyclerView.VERTICAL,false)


        val users =ArrayList<User>()
        users.add(User("Ashmika","8978675645",1))
        users.add(User("Abhilasha","9978675645",2))
        users.add(User("Achal","9978675645",3))
        users.add(User("Ankita","8988675645",1))
        users.add(User("Prajakta","8998675645",2))
        users.add(User("Rashi","7778675645",3))
        users.add(User("Puja","9878675645",1))
        users.add(User("Sonal","9978675645",2))
        users.add(User("Samiksha","9078675645",3))
        users.add(User("shreyashi","7517330645",1))
        users.add(User("Vaishu","8118675645",2))
        users.add(User("Vaishnavi","9818675645",3))
        users.add(User("zoya","9918675645",1))











        val adapter=CustomAdapter(users)

        recyclerView.adapter =adapter

    }
}