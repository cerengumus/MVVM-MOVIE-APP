package com.example.moviemvvm.network.repository

import android.net.Network

class NetworkState(val status : Status,val msg : String) {
    companion object{
        val loaded : NetworkState
        val loading : NetworkState
        val error : NetworkState
        val ENDOFLİST: NetworkState
        init {
            loaded = NetworkState(Status.SUCCESS,"Success ...")
            loading = NetworkState(Status.RUNNING,"Running..")
            error = NetworkState(Status.FAILED,"Something went Wrong ...")
            ENDOFLİST = NetworkState(Status.FAILED,"you have reached end")
        }
    }
}