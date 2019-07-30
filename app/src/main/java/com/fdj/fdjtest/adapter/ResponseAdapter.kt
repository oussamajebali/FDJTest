package com.fdj.fdjtest.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.fdj.fdjtest.R
import com.fdj.fdjtest.model.Response

/**
 * Created by Oussama on 30/07/2019.
 */
class ResponseAdapter(val response: Response): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ResponseViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.response_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = response.results.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        val responseViewHolder = viewHolder as ResponseViewHolder
        responseViewHolder.bindView(response.results[position])
    }
}