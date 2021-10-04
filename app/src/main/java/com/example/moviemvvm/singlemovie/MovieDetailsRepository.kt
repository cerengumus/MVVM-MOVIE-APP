package com.example.moviemvvm.singlemovie

import androidx.lifecycle.LiveData
import com.example.moviemvvm.network.api.MovieDBInterface
import com.example.moviemvvm.network.repository.MovieDetailsNetworkDataSource
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.network.vo.MovieDetails
import io.reactivex.disposables.CompositeDisposable

class MovieDetailsRepository(private val apiService : MovieDBInterface) {
    lateinit var movieDetailsNetworkDataSource: MovieDetailsNetworkDataSource
    fun fetchSingleMovieDetails(compositeDisposable: CompositeDisposable,moveId : Int) : LiveData<MovieDetails>{
        movieDetailsNetworkDataSource = MovieDetailsNetworkDataSource(apiService,compositeDisposable)
        movieDetailsNetworkDataSource.fetchMovieDetails(moveId)
        return movieDetailsNetworkDataSource.downdloadedMovieDetailsResponse
    }
    fun getMovieNetworkState() : LiveData<NetworkState>{
        return movieDetailsNetworkDataSource.networkState
    }
}