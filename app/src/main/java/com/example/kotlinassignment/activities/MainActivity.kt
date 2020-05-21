package com.example.kotlinassignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
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
        //test changes to pull on git

    }

    //Initializing views
    fun initView() {
        toolbar = findViewById(R.id.toolbar)
        recyclerListView = findViewById(R.id.recyclerList)
        recyclerListView.layoutManager = LinearLayoutManager(this)


    }

    //Retrofit api call to get the data and to bound with UI
    fun retrofitCall() {
        RetrofitObject.getApi().getData().enqueue(object : Callback<Items> {
            override fun onFailure(call: retrofit2.Call<Items>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Somthing went wrong", Toast.LENGTH_LONG).show()

            }

            override fun onResponse(call: retrofit2.Call<Items>, response: Response<Items>) {
                val items = response.body()
                val rows = items?.rows

                // will be wxwcutes only if the rows is not null
                rows?.let {
                    // val adapter = ItemAdapter(rows, MainActivity::class)
                    val adapter = ItemAdapter(rows, this@MainActivity)
                    recyclerListView.adapter = adapter
                }

                toolbar.setText(items?.title);
                rows?.forEach {
                    println(it.title + " \n" + it.description + "\n" + it.imageHref)
                }
            }

        })
    }
}
