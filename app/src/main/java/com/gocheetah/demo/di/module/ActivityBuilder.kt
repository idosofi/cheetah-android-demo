package com.gocheetah.demo.di.module

import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds
import com.gocheetah.demo.di.component.MainActivityComponent
import com.gocheetah.demo.view.MainActivity
import dagger.Module


@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivity(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}