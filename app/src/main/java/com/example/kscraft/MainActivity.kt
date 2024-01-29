package com.example.kscraft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val intent=Intent(this,homePage::class.java)
            startActivity(intent)


        }

    }
}