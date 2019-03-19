package io.github.louistsaitszho.logbook

import io.github.louistsaitszho.logbook.logbook.LogbookViewModel
import io.github.louistsaitszho.logbook.page.PageViewModel
import io.github.louistsaitszho.logbook.workoutDetail.WorkoutDetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import java.util.*

val appModule = module {
    viewModel { PageViewModel() }
    viewModel { LogbookViewModel() }
    viewModel { (workoutId: UUID) -> WorkoutDetailViewModel(workoutId) }
}