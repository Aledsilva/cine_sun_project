package com.example.cinesun.ui.home

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cinesun.R
import com.example.cinesun.databinding.ActivityHomeBinding
import com.example.cinesun.ui.adapter.MainAdapter
import com.example.cinesun.viewmodel.ViewModelPopular


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private val viewModel by viewModels<ViewModelPopular>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.callApi()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)

//        binding.recyclerViewHome.setBackgroundColor(Color.BLUE)

        //Em Exibição
        binding.recyclerNowPlaying.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerNowPlaying.adapter = MainAdapter()

        //Em Breve
        binding.recyclerUpToComing.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerUpToComing.adapter = MainAdapter()

        //Mais Populares
        binding.recyclerPopular.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerPopular.adapter = MainAdapter()

        //Melhores Avaliados
        binding.recyclerTopRated.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerTopRated.adapter = MainAdapter()






        viewModel.popularMoviesLiveData.observe(this, { it ->
            it.resultPopularMovies.forEach {
//                binding.bairro.text = it.originalTitle
//                binding.logradouro.text = it.originalLanguage
            }

        })

        //Em Breve
        binding.recyclerUpToComing.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerUpToComing.adapter = MainAdapter()

//        binding.button.setOnClickListener {
//            viewModel.callApi()
//        }
    }

}