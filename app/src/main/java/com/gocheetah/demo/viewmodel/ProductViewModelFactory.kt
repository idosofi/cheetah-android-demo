package com.gocheetah.demo.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gocheetah.demo.repository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(var productRepository: ProductRepository): ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProductViewModel(productRepository) as T
    }
}