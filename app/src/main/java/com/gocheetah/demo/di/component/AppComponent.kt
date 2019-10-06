package com.gocheetah.demo.di.component

import android.app.Application
import com.gocheetah.demo.di.module.ActivityBuilder
import com.gocheetah.demo.di.module.ApiModule
import com.gocheetah.demo.di.module.AppModule
import com.gocheetah.demo.di.module.DbModule
import com.gocheetah.demo.view.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    DbModule::class,
    ApiModule::class,
    ActivityBuilder::class
])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: MainApplication)
}