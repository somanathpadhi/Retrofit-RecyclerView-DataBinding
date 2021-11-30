package com.android.retrofit.retrofit

import com.android.retrofit.dto.PostDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.POST

interface PostAPI {

    @GET("/posts")
    suspend fun getPosts():Response<List<PostDTO>>

}