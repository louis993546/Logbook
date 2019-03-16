package io.github.louistsaitszho.logbook.entity

import androidx.room.Entity
import org.threeten.bp.Duration
import java.util.*

@Entity
data class Split(
    val id: UUID,
    val distance: Float,
    val duration: Duration,
    val strokeRate: Int,
    val heartRate: Int?,
    val damper: Double
)