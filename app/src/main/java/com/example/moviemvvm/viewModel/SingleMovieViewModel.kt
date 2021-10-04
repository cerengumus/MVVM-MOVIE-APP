package com.example.moviemvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.moviemvvm.network.vo.MovieDetails
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.singlemovie.MovieDetailsRepository
import io.reactivex.disposables.CompositeDisposable

class SingleMovieViewModel(
    private val movieRepository : MovieDetailsRepository,
    movieId : Int
): ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    val movieDetails : LiveData<MovieDetails> by lazy{
        movieRepository.fetchSingleMovieDetails(compositeDisposable,movieId)
    }
    val networkState : LiveData<NetworkState> by lazy {
        movieRepository.getMovieNetworkState()
    }
    override fun onCleared(){
        super.onCleared()
        compositeDisposable.dispose()
    }
}