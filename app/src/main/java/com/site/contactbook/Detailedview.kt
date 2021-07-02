package com.site.contactbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Detailedview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedview)

        val tvname:TextView =findViewById(R.id.tvdname)

        val tvmobile:TextView =findViewById(R.id.tvdmobile)

        tvname.text=intent.getStringExtra("user_name")

        tvmobile.text=intent.getStringExtra("mobile_number")
    }
}