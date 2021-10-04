package com.example.moviemvvm.network.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.moviemvvm.network.api.MovieDBInterface
import com.example.moviemvvm.network.vo.MovieDetails
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.lang.Exception

class MovieDetailsNetworkDataSource (
    private val apiService : MovieDBInterface,
    private val compositeDisposable: CompositeDisposable){

    private val _networkState = MutableLiveData<NetworkState>()
    val networkState:LiveData<NetworkState>
        get() = _networkState
    private val _downloadedMovieDetailsResponse = MutableLiveData<MovieDetails>()
    val downdloadedMovieDetailsResponse:LiveData<MovieDetails>
        get() = _downloadedMovieDetailsResponse



    fun fetchMovieDetails(MovieId : Int) {
        _networkState.postValue(NetworkState.loading)
        try {
            val disposablez = apiService.getMovieDetails(MovieId)
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        _downloadedMovieDetailsResponse.postValue(it)
                        _networkState.postValue(NetworkState.loaded)
                    }, {
                        _networkState.postValue(NetworkState.loaded)
                        Log.e("MovieDetailsDataSource", it.message.toString())
                    })
            compositeDisposable.add(disposablez)

        } catch (e: Exception) {
            Log.e("MovieDetailsDataSource", e.message.toString())

        }
    }

}




