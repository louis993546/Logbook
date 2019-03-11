package io.github.louistsaitszho.logbook.model

import org.threeten.bp.OffsetDateTime
import java.util.*

/**
 * Concept2 will often breaks a workout into sections of 5 minutes, and each of them is a [Split]
 * And it's possible for user to be lazy and just take picture of the overall
 */
data class Workout(
    val id: UUID,
    val startTime: OffsetDateTime,  //TODO maybe ZDT would be better? IDK
    val splits: List<Split>?,
    val total: Split
)