package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    lateinit var btnsignin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var btnsignin=findViewById<Button>(R.id.btnsignin)
        btnsignin.setOnClickListener {
            var intent=Intent(baseContext,page2::class.java)
            startActivity(intent)
        }

    }

}
