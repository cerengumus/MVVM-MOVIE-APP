package com.example.moviemvvm.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviemvvm.PopularMoviePagedListAdapter
import com.example.moviemvvm.R
import com.example.moviemvvm.network.api.MovieDBInterface
import com.example.moviemvvm.network.api.TheMovieDBClient
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.singlemovie.SingleActivity
import com.example.moviemvvm.viewModel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_single_movie.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel : MoviePageListRepository
    lateinit var movieRepository: MoviePageListRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val apiService : MovieDBInterface = TheMovieDBClient.getClient()
        movieRepository = MoviePageListRepository(apiService)
          viewModel = getViewModel()
        val  movieAdapter = PopularMoviePagedListAdapter(this)
        val gridLayoutManager = GridLayoutManager(this,3)
        gridLayoutManager.spanSizeLookup = object  : GridLayoutManager.SpanSizeLookup(){
            override fun getSpanSize(position: Int): Int {
                val viewType = movieAdapter.getItemViewType(position)
                if(viewType == movieAdapter.getItemViewType(position)){
                    return 1
                }else
                    return 3
            }
        }
        rv_movie_list.layoutManager = gridLayoutManager
        rv_movie_list.setHasFixedSize(true)
        rv_movie_list.adapter = movieAdapter
        viewModel.moviePagedList.observe(this, Observer {
            movieAdapter.submitList(it)
        })
        viewModel.getNetworkState().observe(this, Observer {
            progress_bar_popular.visibility = if (viewModel.listIsEmpty() && it == NetworkState.loading) View.VISIBLE else View.GONE
            txt_error.visibility = if (viewModel.listIsEmpty() && it == NetworkState.error) View.VISIBLE else View.GONE
        })
    }

    private fun getViewModel(): MoviePageListRepository {
        return ViewModelProviders.of(this,object : ViewModelProvider.Factory){
            override fun <T : ViewModel> create(modelClass: Class<T>){
                @Suppress("UNCHECKED_CAST")
                return MainActivityViewModel(movieRepository) as T
            }[MainActivityViewModel::class.java]
        }
    }
}