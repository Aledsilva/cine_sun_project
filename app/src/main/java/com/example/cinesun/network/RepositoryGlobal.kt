package com.example.cinesun.network

import com.example.cinesun.model.popular.PopularMovies

class RepositoryGlobal {

    private val service = RetroService::class.java
    private val endpoint = RetroInit.getRetrofitInstance(com.example.cinesun.viewmodel.BASE_URL).create(service)


    suspend fun getPopularMovies(): PopularMovies = endpoint.getPopular()




}