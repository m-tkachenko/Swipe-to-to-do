package com.example.swipe_to_do.Presenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.swipe_to_do.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layout_of_task, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewTaskName.text = "Example task number ${position+1}"
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewTaskName: TextView

        init {
            textViewTaskName = itemView.findViewById(R.id.textview_task_name)
        }
    }
}