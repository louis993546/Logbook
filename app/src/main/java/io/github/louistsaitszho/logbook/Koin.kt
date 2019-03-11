package io.github.louistsaitszho.logbook

import io.github.louistsaitszho.logbook.logbook.LogbookViewModel
import io.github.louistsaitszho.logbook.page.PageViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { PageViewModel() }
    viewModel { LogbookViewModel() }
}