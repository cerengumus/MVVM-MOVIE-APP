package com.example.moviemvvm.viewModel

import android.graphics.Movie
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.ui.MoviePageListRepository
import io.reactivex.disposables.CompositeDisposable

class MainActivityViewModel(private val movieRepository : MoviePageListRepository) : ViewModel() {
    private val compositeDisposable = CompositeDisposable()
    val moviePagedList : LiveData<PagedList<Movie>> by lazy{
        movieRepository.fetchMoviePagedList(compositeDisposable)
    }
    val networkState : LiveData<NetworkState> by lazy {
        movieRepository.getNetworkState()
    }
    fun listIsEmpty() : Boolean{
        return moviePagedList.value?.isEmpty() ?: true
    }
    override fun onCleared(){
        super.onCleared()
        compositeDisposable.dispose()
    }

}