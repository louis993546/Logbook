package io.github.louistsaitszho.logbook.model

import org.threeten.bp.OffsetDateTime
import java.util.*

/**
 * Concept2 will often breaks a workout into sections of 5 minutes, and each of them is a [Split]
 * And it's possible for user to be lazy and just take picture of the overall
 */
sealed class Workout {
    abstract val id: UUID
    abstract val startTime: OffsetDateTime
    abstract val overall: Split
}

data class NormalWorkout(
    override val id: UUID,
    override val startTime: OffsetDateTime,
    override val overall: Split,
    val splits: List<Split>
) : Workout()

data class IntervalWorkout(
    override val id: UUID,
    override val startTime: OffsetDateTime,
    override val overall: Split,
    val splits: List<Split>,
    val restDistance: Int
) : Workout()