package com.gocheetah.demo.di.module

import android.app.Application
import android.content.Context
import com.gocheetah.demo.di.component.MainActivityComponent
import dagger.Module
import javax.inject.Singleton
import dagger.Provides


@Module(subcomponents = [
    MainActivityComponent::class
])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context {
        return application
    }
}