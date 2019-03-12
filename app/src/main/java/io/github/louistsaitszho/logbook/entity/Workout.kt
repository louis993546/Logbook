package io.github.louistsaitszho.logbook.entity

import androidx.room.Entity
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import java.util.*

/**
 * TODO at this moment, this only deals with [io.github.louistsaitszho.logbook.model.SingleWorkout]
 */
@Entity
data class Workout(
    val id: UUID,
    val startTime: LocalDateTime,
    val offset: ZoneOffset
//TODO should the overall split info lives here?
)