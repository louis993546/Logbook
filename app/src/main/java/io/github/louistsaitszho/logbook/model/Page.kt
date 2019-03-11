package io.github.louistsaitszho.logbook.model

import org.threeten.bp.Duration
import org.threeten.bp.OffsetDateTime
import java.util.*

sealed class Page

/**
 * Show a list/chart of [Workout] over time according to
 * - filters
 * - what to display
 */
data class TimelinePage(
    val id: UUID,
    val name: String,
    val pageCriteria: PageCriteria,
    val displayColumns: List<DisplayableColumn>
) : Page()

enum class DisplayableColumn {
    ID, DISTANCE, DURATION, STROKE_RATE, HEART_RATE, SPLIT_COUNT, DATE, TIME_AGO
}

/**
 * Shows the best [Workout] according to some criteria
 */
data class BestOfPage(
    val id: UUID,
    val name: String,
    val pageCriteria: PageCriteria
) : Page()

/**
 *
 */
data class PageCriteria(
    val startTimeBefore: OffsetDateTime?,
    val startTimeAfterInclusive: OffsetDateTime?,

    val minOverallDistance: Float?,
    val maxOverallDistanceInclusive: Float?,

    val minOverallDuration: Duration?,
    val maxOverallDurationInclusive: Duration?,

    val minStrokeRate: Int?,
    val maxStrokeRateInclusive: Int?,

    val minHeartRate: Int?,
    val maxHeartRateInclusive: Int?
)
