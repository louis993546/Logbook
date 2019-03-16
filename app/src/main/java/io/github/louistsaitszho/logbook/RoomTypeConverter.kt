package io.github.louistsaitszho.logbook

import androidx.room.TypeConverter
import io.github.louistsaitszho.logbook.entity.WorkoutType
import org.threeten.bp.Duration
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import java.util.*

class RoomTypeConverter {

    // uuid

    @TypeConverter
    fun uuidToString(uuid: UUID?): String? = uuid?.toString()

    @TypeConverter
    fun stringToUuid(string: String?): UUID? = string?.let { UUID.fromString(it) }

    // duration

    @TypeConverter
    fun durationToLong(duration: Duration?): Long? = duration?.toMillis()

    @TypeConverter
    fun longToDuration(long: Long?): Duration? = long?.let { Duration.ofMillis(it) }

    // utc date time

    @TypeConverter
    fun utcDateTimeToString(localDateTime: LocalDateTime?): String? = localDateTime?.toString()

    @TypeConverter
    fun stringToUtcDateTime(string: String?): LocalDateTime? = string?.let { LocalDateTime.parse(it) }

    // zone offset

    @TypeConverter
    fun zoneOffsetToString(zoneOffset: ZoneOffset?): String? = zoneOffset?.id

    @TypeConverter
    fun stringToZoneOffset(string: String?): ZoneOffset? = string?.let { ZoneOffset.of(it) }

    // workout type

    @TypeConverter
    fun workoutTypeToString(workoutType: WorkoutType?): String? = workoutType?.name

    @TypeConverter
    fun stringToWorkoutType(string: String?): WorkoutType? = string?.let { WorkoutType.valueOf(it) }

}