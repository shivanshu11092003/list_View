package com.example.kscraft

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import java.security.AccessControlContext

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>):ArrayAdapter<User>(context,R.layout.eachitem,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater =LayoutInflater.from(context)
        val view =inflater.inflate(R.layout.eachitem,null)
        val image=view.findViewById<ImageView>(R.id.mainimage)
        val pname=view.findViewById<TextView>(R.id.pname)
        val price=view.findViewById<TextView>(R.id.price)

        pname.text=arrayList[position].pname
        price.text=arrayList[position].price
        image.setImageResource(arrayList[position].ImageID)

        return view
    }

}