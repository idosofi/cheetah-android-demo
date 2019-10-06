package com.gocheetah.demo.api

import androidx.lifecycle.LiveData
import com.gocheetah.demo.model.Product
import retrofit2.http.GET

interface ProductApiService {

    @GET("products")
    fun getProducts(): LiveData<ApiResponse<List<Product>>>
}