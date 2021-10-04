package com.example.moviemvvm.network.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/example/moviemvvm/network/repository/NetworkState;", "", "status", "Lcom/example/moviemvvm/network/repository/Status;", "msg", "", "(Lcom/example/moviemvvm/network/repository/Status;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/example/moviemvvm/network/repository/Status;", "Companion", "app_debug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final com.example.moviemvvm.network.repository.Status status = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String msg = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.moviemvvm.network.repository.NetworkState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviemvvm.network.repository.NetworkState loaded = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviemvvm.network.repository.NetworkState loading = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.example.moviemvvm.network.repository.NetworkState error = null;
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    com.example.moviemvvm.network.repository.Status status, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviemvvm.network.repository.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMsg() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/moviemvvm/network/repository/NetworkState$Companion;", "", "()V", "error", "Lcom/example/moviemvvm/network/repository/NetworkState;", "getError", "()Lcom/example/moviemvvm/network/repository/NetworkState;", "loaded", "getLoaded", "loading", "getLoading", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviemvvm.network.repository.NetworkState getLoaded() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviemvvm.network.repository.NetworkState getLoading() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviemvvm.network.repository.NetworkState getError() {
            return null;
        }
    }
}