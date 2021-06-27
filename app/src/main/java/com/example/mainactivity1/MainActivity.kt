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
        Contact( "James James", "0734455666","james@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.jaduikahaniya.com%2F2020%2F10%2Fbeautiful-girls-images-2020-download-now.html&psig=AOvVaw2NaSUjWeZwkWQjyIEhLSMC&ust=1624637441004000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCLCK49b8sPECFQAAAAAdAAAAABAD"),
        Contact("Sarah Samuel","074556667","sarah@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fin.pinterest.com%2Fpin%2F725079608749054183%2F&psig=AOvVaw2NaSUjWeZwkWQjyIEhLSMC&ust=1624637441004000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCLCK49b8sPECFQAAAAAdAAAAABAJ"),
        Contact("Mercy James","0734567890","mercy@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F966866613720935217%2F&psig=AOvVaw2NaSUjWeZwkWQjyIEhLSMC&ust=1624637441004000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCLCK49b8sPECFQAAAAAdAAAAABAO"),
        Contact("sarah John","073456788","sarahj@gmail.com","https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2F280x280_RS%2F37%2F3b%2F1a%2F373b1a086dd16776feb26f1729a94ef4.jpg&imgrefurl=https%3A%2F%2Fwww.pinterest.com%2Fcottoncandy14_%2Fgirls-dps%2F&tbnid=mWcvRpkUOPwWyM&vet=12ahUKEwiQ5N-d1LDxAhUJYBoKHQY5ASMQMygOegUIARDmAQ..i&docid=92d5xxfJ_YFl6M&w=280&h=280&q=images%20of%20girls%20for%20dp&ved=2ahUKEwiQ5N-d1LDxAhUJYBoKHQY5ASMQMygOegUIARDmAQ"),
        Contact("Samuel robert","074567898","robert@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.imagediamond.com%2Fblog%2Fwhatsapp-dp%2F&psig=AOvVaw2NaSUjWeZwkWQjyIEhLSMC&ust=1624637441004000&source=images&cd=vfe&ved=0CAoQjRxqFwoTCLCK49b8sPECFQAAAAAdAAAAABAT"),
        //Contact("Eunice Timothy","0745678983","timothy@gmail.com"""),
        //Contact("Celine Grace","078996544","celine@gmail.com"""),
        //Contact("Vicky john","074567943","vicky@gmail.com"""),
        //Contact("Becky Rodgers","0756347896","becky@gmail.com"""),
        //Contact("Tune Jillo","075643577","tune@gmail.com"""),


        )
    var contactAdapter=ContactAdapter(contactList)
    rvContact.layoutManager= LinearLayoutManager(baseContext,)
//var contactsAdapter=ContactRvAdapter
    rvContact.adapter=contactAdapter





}

}