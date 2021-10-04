package com.example.moviemvvm.singlemovie
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.androidmobilebootcampfourthweek.utils.POSTER_BASE_URL
import com.example.moviemvvm.R
import com.example.moviemvvm.network.vo.MovieDetails
import com.example.moviemvvm.network.api.MovieDBInterface
import com.example.moviemvvm.network.api.TheMovieDBClient
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.viewModel.SingleMovieViewModel
import kotlinx.android.synthetic.main.activity_single_movie.*
import java.text.NumberFormat
import java.util.*


class SingleActivity<T> : AppCompatActivity() {
    private lateinit var viewModel: SingleMovieViewModel
    private lateinit var movieRepository: MovieDetailsRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_movie)
        val movieId: Int = 1
        val apiService : MovieDBInterface = TheMovieDBClient.getClient()
        movieRepository = MovieDetailsRepository(apiService)
        viewModel = getViewModel(movieId)
        viewModel.movieDetails.observe(this, Observer{
            bindUI(it)
        })
        viewModel.networkState.observe(this,Observer{
            progress_bar.visibility = if(it == NetworkState.loading) View.VISIBLE else View.GONE
            txt_error.visibility = if (it == NetworkState.error) View.VISIBLE else View.GONE
        })
    }

    private fun bindUI(it: MovieDetails) {
        movie_title.text = it.title
        movie_tagline.text = it.tagline
        movie_release_date.text = it.releaseDate
        movie_rating.text = it.imdbId.toString()
        movie_runtime.text = it.runtime.toString() + " minutes"
        movie_overview.text = it.overview
        val formatCurrency = NumberFormat.getCurrencyInstance(Locale.US)
        movie_budget.text = formatCurrency.format(it.budget)
        movie_revenue.text = formatCurrency.format(it.revenue)
        val moviePosterUrl = POSTER_BASE_URL + it.posterPath
        Glide.with(this)
            .load(moviePosterUrl)
            .into(iv_movie_poster)
    }

    private fun getViewModel(MovieId:Int): SingleMovieViewModel{
        return ViewModelProviders.of(this,object : ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return SingleMovieViewModel(movieRepository,MovieId) as T

            }
        })[SingleMovieViewModel::class.java]
    }
}