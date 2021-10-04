package com.example.moviemvvm.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lcom/example/moviemvvm/viewModel/SingleMovieViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/moviemvvm/singlemovie/MovieDetailsRepository;", "movieId", "", "(Lcom/example/moviemvvm/singlemovie/MovieDetailsRepository;I)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "movieDetails", "Landroidx/lifecycle/LiveData;", "Lcom/example/moviemvvm/model/vo/MovieDetails;", "getMovieDetails", "()Landroidx/lifecycle/LiveData;", "movieDetails$delegate", "Lkotlin/Lazy;", "networkState", "Lcom/example/moviemvvm/network/repository/NetworkState;", "getNetworkState", "networkState$delegate", "onCleared", "", "app_debug"})
public final class SingleMovieViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.moviemvvm.singlemovie.MovieDetailsRepository movieRepository = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy movieDetails$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy networkState$delegate = null;
    
    public SingleMovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.moviemvvm.singlemovie.MovieDetailsRepository movieRepository, int movieId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.model.vo.MovieDetails> getMovieDetails() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.moviemvvm.network.repository.NetworkState> getNetworkState() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}