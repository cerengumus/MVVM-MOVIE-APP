package com.example.moviemvvm.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviemvvm/network/repository/MovieDetailsNetworkDataSource;", "", "apiService", "Lcom/example/moviemvvm/network/api/MovieDBInterface;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/example/moviemvvm/network/api/MovieDBInterface;Lio/reactivex/disposables/CompositeDisposable;)V", "_downloadedMovieDetailsResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/moviemvvm/model/vo/MovieDetails;", "_networkState", "Lcom/example/moviemvvm/network/repository/NetworkState;", "downdloadedMovieDetailsResponse", "Landroidx/lifecycle/LiveData;", "getDowndloadedMovieDetailsResponse", "()Landroidx/lifecycle/LiveData;", "networkState", "getNetworkState", "fetchMovieDetails", "", "MovieId", "", "app_debug"})
public final class MovieDetailsNetworkDataSource {
    private final com.example.moviemvvm.network.api.MovieDBInterface apiService = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final androidx.lifecycle.MutableLiveData<com.example.moviemvvm.network.repository.NetworkState> _networkState = null;
    private final androidx.lifecycle.MutableLiveData<com.example.moviemvvm.model.vo.MovieDetails> _downloadedMovieDetailsResponse = null;
    
    public MovieDetailsNetworkDataSource(@org.jetbrains.annotations.NotNull()
    com.example.moviemvvm.network.api.MovieDBInterface apiService, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.network.repository.NetworkState> getNetworkState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.model.vo.MovieDetails> getDowndloadedMovieDetailsResponse() {
        return null;
    }
    
    public final void fetchMovieDetails(int MovieId) {
    }
}