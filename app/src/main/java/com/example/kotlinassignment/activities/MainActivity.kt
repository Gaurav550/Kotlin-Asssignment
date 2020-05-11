package com.example.kotlinassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.view.Window
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinassignment.R
import com.example.kotlinassignment.adapters.ItemAdapter
import com.example.kotlinassignment.models.Items
import com.example.kotlinassignment.singleton.RetrofitObject
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerListView: RecyclerView
    private lateinit var toolbar: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        retrofitCall()
        //Window.FEATURE_NO_TITLE
    }

    fun initView() {
        toolbar = findViewById(R.id.toolbar)
        recyclerListView = findViewById(R.id.recyclerList)
        recyclerListView.layoutManager = LinearLayoutManager(this)


    }

    fun retrofitCall() {
        RetrofitObject.getApi().getData().enqueue(object : Callback<Items> {
            override fun onFailure(call: retrofit2.Call<Items>, t: Throwable) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: retrofit2.Call<Items>, response: Response<Items>) {
                val items = response.body()
                val rows = items?.rows
                rows?.let {
                    // val adapter = ItemAdapter(rows, MainActivity::class)
                    val adapter = ItemAdapter(rows, this@MainActivity)
                    recyclerListView.adapter = adapter
                }
//                val adapter = ItemAdapter(rows)
//
//                recyclerListView.adapter = adapter
                toolbar.setText(items?.title);
                rows?.forEach {
                    println(it.title + " \n" + it.description + "\n" + it.imageHref)
                }
            }

        })
    }
}
