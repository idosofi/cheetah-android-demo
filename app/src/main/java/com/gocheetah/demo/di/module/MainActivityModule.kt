package com.gocheetah.demo.di.module

import dagger.Provides
import com.gocheetah.demo.view.MainActivity
import dagger.Module


@Module
class MainActivityModule {

    @Provides
    internal fun provideMainView(mainActivity: MainActivity): MainActivity {
        return mainActivity
    }
}