package com.android.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.android.retrofit.dto.PostDTO
import com.android.retrofit.retrofit.PostAPI
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var  postAPI: PostAPI
    lateinit var data : MutableLiveData<List<PostDTO>>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun getData(){
        lifecycleScope.launchWhenCreated {
            postAPI.getPosts().body()
        }
    }
}