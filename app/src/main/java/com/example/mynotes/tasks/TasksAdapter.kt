package com.example.mynotes.tasks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotes.R
import com.example.mynotes.models.Task
import kotlinx.android.synthetic.main.item_task.view.*

class TasksAdapter(
    private val taskList: MutableList<Task> =  mutableListOf()
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false))

    override fun getItemCount(): Int = taskList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as MyViewHolder).onBind(taskList[position])
    }

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun onBind(task: Task) {
            view.tv_titleview.text = task.title
        }
    }


}