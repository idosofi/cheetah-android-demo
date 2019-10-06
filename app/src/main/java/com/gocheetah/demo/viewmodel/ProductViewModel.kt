package com.gocheetah.demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.gocheetah.demo.model.Product
import com.gocheetah.demo.repository.ProductRepository
import com.gocheetah.demo.utils.Resource
import javax.inject.Inject

class ProductViewModel @Inject constructor(productRepository: ProductRepository) : ViewModel() {
    var products: LiveData<Resource<List<Product>>> = productRepository.products()
}