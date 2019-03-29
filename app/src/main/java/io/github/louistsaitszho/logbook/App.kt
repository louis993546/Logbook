package io.github.louistsaitszho.logbook

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import io.github.louistsaitszho.logbook.feature.logbook.LogbookViewModel
import io.github.louistsaitszho.logbook.feature.page.PageViewModel
import io.github.louistsaitszho.logbook.feature.workoutDetail.WorkoutDetailViewModel
import io.github.louistsaitszho.logbook.utils.getTree
import io.github.louistsaitszho.logbook.utils.koinTimberLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module
import timber.log.Timber
import java.util.*

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

val appModule = module {
    viewModel { PageViewModel() }
    viewModel { LogbookViewModel() }
    viewModel { (workoutId: UUID) -> WorkoutDetailViewModel(workoutId) }
}