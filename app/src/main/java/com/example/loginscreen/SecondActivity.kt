package com.example.loginscreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondact)

        val move = findViewById<Button>(R.id.move)
        move.setOnClickListener { val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)}

    }
}