package io.github.louistsaitszho.logbook

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AndroidThreeTen.init(this)
        Timber.plant(getTree())
        startKoin {
            logger(logger = koinTimberLogger)
            modules(appModule)
        }
    }
}