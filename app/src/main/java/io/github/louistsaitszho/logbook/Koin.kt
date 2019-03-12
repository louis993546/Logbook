package io.github.louistsaitszho.logbook

import io.github.louistsaitszho.logbook.logbook.LogbookViewModel
import io.github.louistsaitszho.logbook.model.SingleWorkout
import io.github.louistsaitszho.logbook.page.PageViewModel
import io.github.louistsaitszho.logbook.workout.WorkoutViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { PageViewModel() }
    viewModel { LogbookViewModel() }
    viewModel { (workout: SingleWorkout) -> WorkoutViewModel(workout) }
}