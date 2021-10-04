package com.example.moviemvvm.singlemovie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/example/moviemvvm/singlemovie/MovieDetailsRepository;", "", "apiService", "Lcom/example/moviemvvm/network/api/MovieDBInterface;", "(Lcom/example/moviemvvm/network/api/MovieDBInterface;)V", "movieDetailsNetworkDataSource", "Lcom/example/moviemvvm/network/repository/MovieDetailsNetworkDataSource;", "getMovieDetailsNetworkDataSource", "()Lcom/example/moviemvvm/network/repository/MovieDetailsNetworkDataSource;", "setMovieDetailsNetworkDataSource", "(Lcom/example/moviemvvm/network/repository/MovieDetailsNetworkDataSource;)V", "fetchSingleMovieDetails", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviemvvm/model/vo/MovieDetails;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "moveId", "", "getMovieNetworkState", "Lcom/example/moviemvvm/network/repository/NetworkState;", "app_debug"})
public final class MovieDetailsRepository {
    private final com.example.moviemvvm.network.api.MovieDBInterface apiService = null;
    public com.example.moviemvvm.network.repository.MovieDetailsNetworkDataSource movieDetailsNetworkDataSource;
    
    public MovieDetailsRepository(@org.jetbrains.annotations.NotNull()
    com.example.moviemvvm.network.api.MovieDBInterface apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviemvvm.network.repository.MovieDetailsNetworkDataSource getMovieDetailsNetworkDataSource() {
        return null;
    }
    
    public final void setMovieDetailsNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.example.moviemvvm.network.repository.MovieDetailsNetworkDataSource p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.model.vo.MovieDetails> fetchSingleMovieDetails(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, int moveId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.network.repository.NetworkState> getMovieNetworkState() {
        return null;
    }
}