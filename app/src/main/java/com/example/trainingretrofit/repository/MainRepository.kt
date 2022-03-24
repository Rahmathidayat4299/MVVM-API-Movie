package com.example.trainingretrofit.repository

import com.example.trainingretrofit.service.RetrofitService

class MainRepository constructor(private  val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies()
}