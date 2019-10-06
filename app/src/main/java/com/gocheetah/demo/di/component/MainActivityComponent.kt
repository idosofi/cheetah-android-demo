package com.gocheetah.demo.di.component

import com.gocheetah.demo.di.module.MainActivityModule
import com.gocheetah.demo.view.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}