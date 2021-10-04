package com.example.moviemvvm.network.api

import com.example.moviemvvm.network.vo.MovieDetails
import com.example.moviemvvm.network.vo.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import io.reactivex.rxjava3.core.Single
import retrofit2.http.Query

interface MovieDBInterface {
    @GET("movie/popular")
    fun getPopularMovie(@Query("page")page : Int): Single<MovieResponse>

    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id")id: Int): Single<MovieDetails>
}