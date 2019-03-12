package io.github.louistsaitszho.logbook.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import org.threeten.bp.Duration
import java.util.*

@Parcelize
data class Split(
    val id: UUID,
    val distance: Float,
    val duration: Duration,
    val strokeRate: Int,
    val heartRate: Int?
) : Parcelable