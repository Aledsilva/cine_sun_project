package com.example.cinesun.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetroInit {

    companion object {
        fun getRetrofitInstance(path : String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl(path)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}