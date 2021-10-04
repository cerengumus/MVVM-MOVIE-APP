package com.example.moviemvvm.network.repository

import android.graphics.Movie
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.PageKeyedDataSource
import com.example.androidmobilebootcampfourthweek.utils.FIRST_PAGE
import com.example.moviemvvm.network.api.MovieDBInterface
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.AbstractExecutorService

class MovieDataSource(
    private val apiService: MovieDBInterface,
    private val compositeDisposable: CompositeDisposable): PageKeyedDataSource<Int, Movie>() {
    private var page = FIRST_PAGE
    val networkState: MutableLiveData<NetworkState> = MutableLiveData()


    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Movie>) {
        networkState.postValue(NetworkState.loading)
        compositeDisposable.add(
            apiService.getPopularMovie(params.key)
                .subscribeOn(Schedulers.io)
                .subscribe(
                    {
                        if (it.totalPages >= params.key + 1){
                            callback.onResult(it.movieList,params.key + 1)
                            networkState.postValue(NetworkState.loaded)
                        }else{
                            networkState.postValue(NetworkState.ENDOFLİST)
                        }
                     },{
                        networkState.postValue(NetworkState.error)
                        Log.e("MovieDataSource",it.message)
                    }
                )

        )
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Movie>) {
        TODO("Not yet implemented")
    }

    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Movie>
    ) {
        networkState.postValue(NetworkState.loading)
        compositeDisposable.add(
            apiService.getPopularMovie(page)
                .subscribeOn(Schedulers.io)
                .subscribe(
                    {
                        callback.onResult(it.movieList,null,page+1)
                        networkState.postValue(NetworkState.loaded)
                    },{
                        networkState.postValue(NetworkState.error)
                        Log.e("MovieDataSource",it.message)
                    }
                )

        )
    }

}