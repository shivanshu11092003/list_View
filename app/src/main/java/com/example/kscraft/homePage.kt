package com.example.kscraft

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class homePage : AppCompatActivity() {

    lateinit var userArrayList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val pname= arrayOf("Product 1","Product 2","Product 3","Product 4","Product 5","Product 6","Product 7","Product 8",
            "Product 9","Product 10","Product 11","Product 12")
        val price = arrayOf("₹200","₹300","₹700","₹470","₹589","₹469","₹2999","₹10999","₹4599","₹3400","₹12099","₹1299")

        val imageID= arrayOf(R.drawable.product1,R.drawable.product2,R.drawable.product3,R.drawable.product4,
            R.drawable.product5,
            R.drawable.product2,R.drawable.product3,R.drawable.product4,R.drawable.product5
            ,R.drawable.product2,R.drawable.product3,R.drawable.product3)
        userArrayList=ArrayList()
        for (eachindex in pname.indices){
            val user=User(pname[eachindex],price[eachindex],imageID[eachindex])
            userArrayList.add(user)
        }
        val listView=findViewById<ListView>(R.id.listView)
        listView.isClickable=true
        listView.adapter=MyAdapter(this,userArrayList)





        listView.setOnItemClickListener { parent, view, position, id ->

            val productname=pname[position]
            val price=price[position]
            val image =imageID[position]
            val i=Intent(this,productdetails::class.java)

            i.putExtra("productname",productname)
            i.putExtra("price",price)
            i.putExtra("image",image)
            startActivity(i)





        }


    }
}