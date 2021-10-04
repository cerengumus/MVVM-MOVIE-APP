package com.example.moviemvvm.ui

import android.graphics.Movie
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.example.androidmobilebootcampfourthweek.utils.POST_PER_PAGE
import com.example.moviemvvm.network.api.MovieDBInterface
import com.example.moviemvvm.network.repository.MovieDataSource
import com.example.moviemvvm.network.repository.MovieDataSourceFactory
import com.example.moviemvvm.network.repository.NetworkState

class MoviePageListRepository(private val apiSevice : MovieDBInterface){
    lateinit var moviePagedList : LiveData<PagedList<Movie>>
    lateinit var movieDataSourceFactory: MovieDataSourceFactory
    fun fetchMoviePagedList(compositeDisposable: io.reactivex.disposables.CompositeDisposable) : LiveData<PagedList<Movie>>{
        movieDataSourceFactory = MovieDataSourceFactory(apiSevice,compositeDisposable)
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(POST_PER_PAGE)
            .build()
        moviePagedList = LivePagedListBuilder(movieDataSourceFactory,config).build()
        return moviePagedList
    }
    fun getNetworkState() : LiveData<NetworkState>{
        return Transformations.switchMap<MovieDataSource,NetworkState>(
            movieDataSourceFactory.moviesLiveDataSource,MovieDataSource::networkState
        )
    }

}