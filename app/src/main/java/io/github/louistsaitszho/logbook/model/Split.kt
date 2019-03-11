package io.github.louistsaitszho.logbook.model

import org.threeten.bp.Duration
import java.util.*

data class Split(
    val id: UUID,
    val distance: Float,
    val duration: Duration,
    val strokeRate: Int,
    val heartRate: Int?
)