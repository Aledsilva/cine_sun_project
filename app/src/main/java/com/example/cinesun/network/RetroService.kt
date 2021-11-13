package com.example.cinesun.network

import com.example.cinesun.model.Posts
import com.example.cinesun.model.popular.PopularMovies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "8086f549c9fd8ca62d927fd46cc1e27a"

const val BASE_URL = "https://developers.themoviedb.org/"
const val url_base = "https://jsonplaceholder.typicode.com/"
//private val api_key = "9195aa41108646aa6d4add8c9d142d4f"

//https://api.themoviedb.org/3/movie/popular?api_key=9195aa41108646aa6d4add8c9d142d4f
interface RetroService {

    @GET("/3/movie/popular")
    suspend fun getPopular(
        @Query("api_key") apiKey: String = "9195aa41108646aa6d4add8c9d142d4f"
    ): PopularMovies

    @GET("posts")
    fun getPosts(): Call<List<Posts>>

    //em cartaz  USAR ESSA ENDPOINT PRIMEIRO
//    @GET("/3/movie/now_playing")
    //fun getPlaying(@Query("api_key") key: String): Call<>
//    suspend fun getNowPlaying(
//        @Query("api_key") apiKey: String
//    ): NowPlayingResponse

//    //melhores avaliados
//    @GET("/3/movie/top_rated?api_key=")
//    suspend fun getTopRated(
//        @Query("api_key") apiKey: String
//    ): TopRatedResponse
//
//    //proximos lançamentos
//    @GET("/3/movie/upcoming?api_key=")
//    suspend fun getUpComing(
//        @Query("api_key") apiKey: String
//    ): UpComingResponse
//
    //populares

//
//    //detalhes
//    @GET("/3//movie/{movie_id}?api_key=")
//    suspend fun getDetails(
//        @Query("movie_id") mov_id: String,
//        @Query("api_key") apiKey: String
//    ): DetailsResponse
//
//    //review
//    @GET("/3/movie/{movie_id}/reviews?api_key=")
//    suspend fun getReview(
//        @Query("movie_id") mov_id: String,
//        @Query("api_key") apiKey: String
//    ): ReviewsResponse
//
//    //similares
//    @GET("/3/movie/{movie_id}/similar?api_key=")
//    suspend fun getSimilar(
//        @Query("movie_id") mov_id: String,
//        @Query("api_key") apiKey: String
//    ): SimilarResponse
}