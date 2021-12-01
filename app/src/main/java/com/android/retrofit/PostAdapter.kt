package com.android.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.retrofit.databinding.PostListItemBinding
import com.android.retrofit.dto.PostDTO


class PostAdapter(private val list: List<PostDTO>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        return PostViewHolder(
            PostListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.binding.userID.text = list?.get(position)?.id.toString()
        holder.binding.postTitle.text = list?.get(position)?.title.toString()
        holder.binding.description.text = list?.get(position)?.body.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PostViewHolder(val binding: PostListItemBinding) :
        RecyclerView.ViewHolder(binding.root)
}

