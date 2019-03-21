package com.example.mynotes.tasks


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.mynotes.R
import com.example.mynotes.models.Task
import kotlinx.android.synthetic.main.fragment_tasks_list.*

class TasksListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tasks_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerview.layoutManager = LinearLayoutManager(context)
        val adapter = TasksAdapter(mutableListOf(
            Task("taskOne"),
            Task("taskTwo"),
            Task("taskAnother")
        ))
        recyclerview.adapter = adapter


    }

    companion object {
        fun newInstance(): TasksListFragment = TasksListFragment()
    }
}
