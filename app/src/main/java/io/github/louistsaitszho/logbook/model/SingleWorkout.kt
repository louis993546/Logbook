package io.github.louistsaitszho.logbook.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.threeten.bp.OffsetDateTime
import java.util.*

/**
 * Concept2 will often breaks a workout into sections of 5 minutes, and each of them is a [Split]
 * And it's possible for user to be lazy and just take picture of the overall
 */
@Parcelize
data class SingleWorkout(
    val id: UUID,
    val startTime: OffsetDateTime,
    val splits: List<Split>?,
    val overall: Split,
    val tags: Set<String>
) : Parcelable

//TODO rough idea
//data class IntervalWorkout(
//    val id: UUID,
//    val startTime: OffsetDateTime,
//    val tags: Set<String>
//)