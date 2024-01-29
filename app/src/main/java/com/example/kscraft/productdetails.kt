package com.example.kscraft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class productdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productdetails)

        val name=intent.getStringExtra("productname")
        val price=intent.getStringExtra("price")
        val imageid=intent.getIntExtra("image",R.drawable.product5)

        val imagetv=findViewById<ImageView>(R.id.imageView)
        val  pricetv=findViewById<TextView>(R.id.priceid)
        val producttv=findViewById<TextView>(R.id.productid)
        producttv.text=name
        pricetv.text=price

        imagetv.setImageResource(imageid)



    }
}