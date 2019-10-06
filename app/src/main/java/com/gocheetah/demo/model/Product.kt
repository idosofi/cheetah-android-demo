package com.gocheetah.demo.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class Product(@PrimaryKey var id: Int,
                   var name: String,
                   var photoUrl: String,
                   var inStock: Boolean)