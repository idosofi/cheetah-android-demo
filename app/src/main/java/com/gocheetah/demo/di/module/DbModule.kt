package com.gocheetah.demo.di.module

import android.app.Application
import androidx.room.Room
import com.gocheetah.demo.db.AppDatabase
import com.gocheetah.demo.db.dao.ProductDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {

    @Provides
    @Singleton
    internal fun provideDatabase(application: Application): AppDatabase {
        val builder = Room.databaseBuilder(application, AppDatabase::class.java, "cheetah-demo-db")
        return builder.build()
    }

    @Provides
    @Singleton
    internal fun provideProductDao(db: AppDatabase): ProductDao {
        return db.productDao()
    }
}