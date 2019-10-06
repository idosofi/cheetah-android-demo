package com.gocheetah.demo.repository

import androidx.lifecycle.LiveData
import com.gocheetah.demo.AppExecutors
import com.gocheetah.demo.api.ApiResponse
import com.gocheetah.demo.api.ProductApiService
import com.gocheetah.demo.db.dao.ProductDao
import com.gocheetah.demo.model.Product
import com.gocheetah.demo.utils.Resource
import javax.inject.Inject

class ProductRepository @Inject constructor(val api: ProductApiService,
                                            val productDao: ProductDao,
                                            val appExecutors: AppExecutors) {

    fun products(): LiveData<Resource<List<Product>>> {
        return object: NetworkBoundResource<List<Product>, List<Product>>(appExecutors) {

            override fun loadFromDb(): LiveData<List<Product>> {
                return productDao.getProducts()
            }

            override fun shouldFetch(data: List<Product>?): Boolean {
                return true
            }

            override fun createCall(): LiveData<ApiResponse<List<Product>>> {
                return api.getProducts()
            }

            override fun saveCallResult(item: List<Product>) {
                productDao.insertProducts(item)
            }
        }.asLiveData()
    }
}
