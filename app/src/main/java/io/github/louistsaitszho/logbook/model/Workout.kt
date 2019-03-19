package io.github.louistsaitszho.logbook.model

import org.threeten.bp.OffsetDateTime
import java.util.*

/**
 * Concept2 will often breaks a workout into sections of 5 minutes, and each of them is a [Split]
 * And it's possible for user to be lazy and just take picture of the overall
 */
interface WorkoutData {
    val id: UUID
    val startTime: OffsetDateTime
    val overall: Split
}

sealed class Workout : WorkoutData

data class WorkoutDataImpl(
    override val id: UUID,
    override val startTime: OffsetDateTime,
    override val overall: Split
) : WorkoutData

data class NormalWorkout(
    private val data: WorkoutDataImpl,
    val splits: List<Split>
) : Workout(), WorkoutData by data

data class IntervalWorkout(
    private val data: WorkoutDataImpl,
    val splits: List<Split>,
    val restDistance: Int
) : Workout(), WorkoutData by data