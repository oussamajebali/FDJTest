package com.fdj.fdjtest.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import com.bumptech.glide.Glide
import com.fdj.fdjtest.model.Urls
import kotlinx.android.synthetic.main.response_item.view.*

/**
 * Created by Oussama on 30/07/2019.
 */
class ResponseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindView(url: Urls) {
        itemView.description.text = url.description
        Glide.with(itemView.context).load(url.urls.image).into(itemView.image)
    }
}