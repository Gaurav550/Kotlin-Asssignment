package com.example.kotlinassignment.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.ViewCompat.animate
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.kotlinassignment.R
import com.example.kotlinassignment.activities.MainActivity
import com.example.kotlinassignment.models.Row

class ItemAdapter(private val rows: MutableList<Row>, private val context: Context) :
    RecyclerView.Adapter<ItemAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        Log.e("size is " + rows.size, " items")
        return rows.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        if (rows[position].description != null) {
            holder.tv_description.setText(rows[position].description)
        } else {
            holder.tv_description.setText("Not avilable")
        }
        if (rows[position].title != null) {
            holder.tv_title.setText(rows[position].title)
        } else {
            holder.tv_title.setText("Not avilable")
        }

        rows[position].imageHref?.let {url->
            setImage(url, holder.image) }
    }

    inner class MyHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val tv_title: TextView = view.findViewById(R.id.tv_title)
        val tv_description: TextView = view.findViewById(R.id.tv_description)
        val image by lazy { view.findViewById<ImageView>(R.id.image)}
    }

    fun setImage(url: String, view: ImageView) {
        Glide.with(view.context)
            .load("https://images.unsplash.com/photo-1566487097168-e91a4f38bee2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1000&q=80")
            //.error(R.drawable.ic_launcher_foreground)
            .into(view)
    }
}