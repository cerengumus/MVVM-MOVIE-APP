package com.example.moviemvvm

import android.content.Context
import android.content.Intent
import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.androidmobilebootcampfourthweek.utils.POSTER_BASE_URL
import com.example.moviemvvm.network.repository.NetworkState
import com.example.moviemvvm.singlemovie.SingleActivity
import kotlinx.android.synthetic.main.activity_single_movie.view.*
import kotlinx.android.synthetic.main.movie_list_item.view.*
import kotlinx.android.synthetic.main.network_date_item.view.*

class PopularMoviePagedListAdapter : PagedListAdapter<Movie,RecyclerView.ViewHolder>(MovieDiffCallback()) {
    class MovieDiffCallback : DiffUtil.ItemCallback<Movie>(){
        val MOVIE_VİEW_TYPE = 1
        val NETWORK_VİEW_TYPE = 2

        private var networkState: NetworkState? = null

        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == MOVIE_VIEW_TYPE){
            (holder as MovieItemViewHolder).bind(getItem(position),context)
        }else{
            (holder as NetworkStateViewHolder).bind(networkState)
        }
    }

    override fun getItemCount(): Int {
        return super.getItemCount() + if (hasExtraRow()) 1 else 0
    }
    private fun hasExtraRow() : Boolean{
        return networkStae != null && networkState != networkState.loaded
    }

    override fun getItemViewType(position: Int): Int {
        return if (hasExtraRow() && position == itemCount - 1){
            NETWORK_VİEW_TYPE
        }else
            MOVIE_VİEW_TYPE
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val layoutInflater = LayoutInflater.from(parent.context)
        val view : View
        if (viewType == MOVİE_VİEW_TYPE){
            view = layoutInflater.inflate(R.layout.movie_list_item,parent,false)
            return MovieItemViewHolder
        }else{
            view = layoutInflater.inflate(R.layout.network_date_item,parent,false)
            return NetworkStateViewHolder(view)
        }
    }
    class MovieItemViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bind(movie: Movie?,context : Context){
            itemView.cv_movie_title.text = movie?.title
            itemView.cv_movie_release_date.text = movie?.releaseDate
            val moviePosterURL = POSTER_BASE_URL + movie.posterPath
            Glide.with(itemView.context)
                .load(moviePosterURL)
                .into(itemView.cv_iv_movie_poster)
            itemView.setOnClickListener {
                val intent = Intent(context,SingleActivity::class.java)
                intent.putExtra("id",movie.id)
                context.startActivity(intent)
            }
        }
    }
    class NetworkStateViewHolder( view :View) : RecyclerView.ViewHolder(view) {
        fun bind(networkState: NetworkState?) {
            if (networkState != null && networkState == NetworkState.loading){
                itemView.progress_bar_item.visibility = View.VISIBLE
            }else
            {
                itemView.progress_bar_item.visibility = View.GONE
            }
            if (networkState != null && networkState == NetworkState.error){
                itemView.error_msg_item.visibility = View.VISIBLE
                itemView.error_msg_item.text = networkState.msg
            }else if(networkState != null && networkState == NetworkState.ENDOFLİST)
            {
                itemView.error_msg_item.visibility = View.VISIBLE
                itemView.error_msg_item.text = networkState.msg
            }else{
                itemView.error_msg_item.visibility = View.GONE
            }
         }

    }
    fun setNetworkState(networkState: NetworkState?) {
        val previousState = this.NetworkState
        val hadExtraRor = hasExtraRow()
        this.networkState = networkState()
        val extraRow = hasExtraRow()
        if (hadExtraRor != extraRow) {
            if (hadExtraRor){
                notifyItemRemoved(super.getItemCount())
            } else {
                notifyItemInserted(super.getItemCount())
            }
         }else if (extraRow && previousState != movieNetworkState){
             notifyItemChanged(itemCount - 1)
        }
    }
}