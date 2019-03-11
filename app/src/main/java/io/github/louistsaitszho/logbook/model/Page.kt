package io.github.louistsaitszho.logbook.model

import java.util.*

sealed class Page

/**
 * Show a list/chart of [Workout] over time according to
 * - filters
 * - order
 * - what to display
 */
data class HistoryDashboard(
    val id: UUID,
    val name: String
    //TODO filter
    //TODO what to display
    //TODO sorting (or just how to display in general)
) : Page()

/**
 * Shows the best [Workout] according to some criteria
 */
data class BestDashboard(
    val id: UUID,
    val name: String
    //TODO val criteria: ?
) : Page()
