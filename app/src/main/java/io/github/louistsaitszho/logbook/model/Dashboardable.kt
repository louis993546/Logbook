package io.github.louistsaitszho.logbook.model

import java.util.*

/**
 * The basic requirement for types of dashboard: [id] for identification, and [name] for display
 *
 * TODO this still sound kinda stupid
 */
interface Dashboardable {
    val id: UUID
    val name: String
}

/**
 * Show a list/chart of [Workout] over time according to
 * - filters
 * - order
 * - what to display
 */
data class HistoryDashboard(
    override val id: UUID,
    override val name: String
    //TODO filter
    //TODO what to display
    //TODO sorting (or just how to display in general)
) : Dashboardable

/**
 * Shows the best [Workout] according to some criteria
 */
data class BestDashboard(
    override val id: UUID,
    override val name: String
    //TODO val criteria: ?
) : Dashboardable
