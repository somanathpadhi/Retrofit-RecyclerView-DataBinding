package com.android.retrofit.di

import com.android.retrofit.retrofit.PostAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object HiltModule {
    @Provides
    fun provideBaseURL(): String = "https://jsonplaceholder.typicode.com/"

    @Provides
    fun provideRetrofit(url: String): Retrofit =
        Retrofit.Builder().baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create()).build()

    @Provides
    fun providePostAPI(retrofit: Retrofit): PostAPI =
        retrofit.create(PostAPI::class.java)
}