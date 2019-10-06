package com.gocheetah.demo.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.gocheetah.demo.model.Product

@Dao
interface ProductDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertProducts(plants: List<Product>)

    @Query("SELECT * FROM products ORDER BY name")
    fun getProducts(): LiveData<List<Product>>
}