package com.example.mainactivity1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()

    }

fun displayContact(){
    var rvContact = findViewById<RecyclerView>(R.id.rvContact)
    var contactList = listOf(
        Contact( "James James", "0734455666","james@gmail.com"),
        Contact("Sarah Samuel","074556667","sarah@gmail.com"),
        Contact("Mercy James","0734567890","mercy@gmail.com"),
        Contact("sarah John","073456788","sarahj@gmail.com"),
        Contact("Samuel robert","074567898","robert@gmail.com"),
        Contact("Eunice Timothy","0745678983","timothy@gmail.com"),
        Contact("Celine Grace","078996544","celine@gmail.com"),
        Contact("Vicky john","074567943","vicky@gmail.com"),
        Contact("Becky Rodgers","0756347896","becky@gmail.com"),
        Contact("Tune Jillo","075643577","tune@gmail.com"),


        )
    var contactAdapter=ContactAdapter(contactList)
    rvContact.layoutManager= LinearLayoutManager(baseContext)
    rvContact.adapter=contactAdapter





}

}