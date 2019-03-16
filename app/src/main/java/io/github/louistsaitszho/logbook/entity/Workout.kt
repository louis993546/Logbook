package io.github.louistsaitszho.logbook.entity

import androidx.room.Entity
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import java.util.*

@Entity
data class Workout(
    val id: UUID,
    val startTime: LocalDateTime,
    val offset: ZoneOffset,
    val type: WorkoutType
)

//TODO need to store rest distance for interval workout

enum class WorkoutType {
    REGULAR, INTERVAL
}