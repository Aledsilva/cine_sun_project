package com.example.cinesun.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cinesun.model.popular.PopularMovies
import com.example.cinesun.network.RepositoryGlobal
import com.example.cinesun.network.RetroInit
import com.example.cinesun.network.RetroService
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val BASE_URL = "https://api.themoviedb.org/"
const val url_base = "https://jsonplaceholder.typicode.com/"


class ViewModelPopular : ViewModel() {

    private val popularMoviesMutableLiveData = MutableLiveData<PopularMovies>()
    val popularMoviesLiveData: LiveData<PopularMovies> = popularMoviesMutableLiveData

    private val repositoryGlobal = RepositoryGlobal()

    fun callApi() {
        viewModelScope.launch {
            popularMoviesMutableLiveData.postValue(repositoryGlobal.getPopularMovies())
        }
    }

}