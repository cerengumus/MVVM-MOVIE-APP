package com.example.moviemvvm.network.repository

import android.graphics.Movie
import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import com.example.moviemvvm.network.api.MovieDBInterface
import io.reactivex.disposables.CompositeDisposable
import javax.sql.DataSource

class MovieDataSourceFactory(
    private val apiService : MovieDBInterface,
    private val compositeDisposable: CompositeDisposable
    ) : DataSource.Factory<Int, Movie> {
        val moviesLiveDataSource = MutableLiveData<MovieDataSource>()
    override fun create()  : DataSource<Int,Movie>{
        val movieDataSource = MovieDataSource(apiService,compositeDisposable)
        moviesLiveDataSource.postValue(movieDataSource)
        return movieDataSource
    }

}
