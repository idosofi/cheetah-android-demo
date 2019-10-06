package com.gocheetah.demo.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gocheetah.demo.R
import com.gocheetah.demo.viewmodel.ProductViewModel
import com.gocheetah.demo.viewmodel.ProductViewModelFactory
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var productViewModelFactory: ProductViewModelFactory
    private lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productViewModel = ViewModelProvider(viewModelStore, productViewModelFactory).get(ProductViewModel::class.java)

        productViewModel.products.observe(this, Observer {

        })
    }
}
