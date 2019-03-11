package io.github.louistsaitszho.logbook

import io.github.louistsaitszho.logbook.dashboard.DashboardViewModel
import io.github.louistsaitszho.logbook.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { DashboardViewModel() }
    viewModel { HomeViewModel() }
}