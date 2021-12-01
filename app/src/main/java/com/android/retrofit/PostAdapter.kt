package com.android.retrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.retrofit.dto.PostDTO
import kotlinx.android.synthetic.main.post_list_item.view.*


class PostAdapter(private val list: List<PostDTO>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.post_list_item, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.itemView.userID.text = list?.get(position)?.id.toString()
        holder.itemView.postTitle.text = list?.get(position)?.title.toString()
        holder.itemView.description.text = list?.get(position)?.body.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

