package com.example.mainactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class viewactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewactivity)
        var nameIntent=intent.getStringExtra("name")
        var phoneIntent=intent.getStringExtra("phone")
        var emailIntent=intent.getStringExtra("email")
        var imageIntent=intent.getStringExtra("image")

        val name=findViewById<TextView>(R.id.tvnames)
        val phoneNumber=findViewById<TextView>(R.id.tvphones)
        val email=findViewById<TextView>(R.id.tvemails)
        val image=findViewById<ImageView>(R.id.imgImage)



        name.text=nameIntent
        phoneNumber.text=phoneIntent
        email.text=emailIntent
        Picasso.get().load(imageIntent).into(image)


    }

}