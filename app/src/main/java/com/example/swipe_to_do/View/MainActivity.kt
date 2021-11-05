package com.example.swipe_to_do.View

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavDeepLinkBuilder
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.swipe_to_do.Presenter.OnSwipeListener
import com.example.swipe_to_do.Presenter.RecyclerAdapter
import com.example.swipe_to_do.R

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    private lateinit var layout: FrameLayout
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_for_tasks)
        layout = findViewById(R.id.swipeLayout)
        showRecycler()
        layout.setOnTouchListener(object : OnSwipeListener(this@MainActivity) {

            override fun onSwipeDown() {
                super.onSwipeDown()

                Toast.makeText(this@MainActivity, "Swipe down gesture detected", Toast.LENGTH_SHORT)
                    .show()

              var ft: FragmentTransaction = supportFragmentManager.beginTransaction()
                ft.replace(R.id.swipeLayout, TaskFragment()).commit()

            }
        })



    }
    fun showRecycler(){
        layoutManager = LinearLayoutManager(this)
        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter
    }


}