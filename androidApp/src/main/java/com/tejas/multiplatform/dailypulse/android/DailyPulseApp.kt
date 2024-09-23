package com.tejas.multiplatform.dailypulse.android

import android.app.Application
import com.tejas.multiplatform.dailypulse.android.di.ViewModelsModule
import com.tejas.multiplatform.dailypulse.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DailyPulseApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + ViewModelsModule

        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}