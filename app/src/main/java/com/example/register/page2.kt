package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class page2 : AppCompatActivity() {

    lateinit var btnlog: Button
    lateinit var btnsign: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)



    var spGender = findViewById<Spinner>(R.id.spGender)
    var btnsignin = findViewById<Button>(R.id.btnsignin)

    btnsignin.setOnClickListener {
        var intent = Intent(baseContext, page2::class.java)
        startActivity(intent)
    }

    val gender = arrayOf("Male", "Female")
    val adapter_spinner = ArrayAdapter<String>(baseContext, android.R.layout.simple_spinner_item, gender)
    adapter_spinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    spGender.adapter=adapter_spinner
}}