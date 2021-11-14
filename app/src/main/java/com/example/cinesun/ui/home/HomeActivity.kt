package com.example.cinesun.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cinesun.MoviesData
import com.example.cinesun.R
import com.example.cinesun.databinding.ActivityHomeBinding
import com.example.cinesun.ui.adapter.MainAdapter
import com.example.cinesun.viewmodel.ViewModelPopular


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var moviesData: ArrayList<MoviesData>

    private val viewModel by viewModels<ViewModelPopular>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.loadLists()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

//        binding.recyclerViewHome.setBackgroundColor(Color.BLUE)

        //Em Exibição
        moviesData = ArrayList<MoviesData>()
        binding.recyclerNowPlaying.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerNowPlaying.adapter = MainAdapter(moviesData)

        //Em Breve
        binding.recyclerUpToComing.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerUpToComing.adapter = MainAdapter(moviesData)

        //Mais Populares
        binding.recyclerPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerPopular.adapter = MainAdapter(moviesData)

        //Melhores Avaliados
        binding.recyclerTopRated.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerTopRated.adapter = MainAdapter(moviesData)


        viewModel.popularMoviesLiveData.observe(this, { it ->
            it.resultPopularMovies.forEach {
//                binding.bairro.text = it.originalTitle
//                binding.logradouro.text = it.originalLanguage
            }

        })

        listMovies()



//        binding.button.setOnClickListener {
//            viewModel.callApi()
//        }
    }

    fun listMovies(){
        moviesData.add(MoviesData(R.drawable.poster,"Chapolin","Não contavam com minha astucia"))
        moviesData.add(MoviesData(R.drawable.poster2,"Coringa","We live in a society..."))
        moviesData.add(MoviesData(R.drawable.poster3,"Ela","..."))
        moviesData.add(MoviesData(R.drawable.poster4,"Baby Driver","Who's slow?"))
    }

}