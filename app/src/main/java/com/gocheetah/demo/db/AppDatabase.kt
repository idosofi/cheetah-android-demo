package com.gocheetah.demo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gocheetah.demo.db.dao.ProductDao
import com.gocheetah.demo.model.Product

@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun productDao(): ProductDao
}