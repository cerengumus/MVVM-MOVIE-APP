package com.example.moviemvvm.network.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviemvvm/network/api/MovieDBInterface;", "", "getMovieDetails", "Lio/reactivex/rxjava3/core/Single;", "Lcom/example/moviemvvm/model/vo/MovieDetails;", "id", "", "app_debug"})
public abstract interface MovieDBInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract io.reactivex.rxjava3.core.Single<com.example.moviemvvm.model.vo.MovieDetails> getMovieDetails(@retrofit2.http.Path(value = "movie_id")
    int id);
}