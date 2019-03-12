package io.github.louistsaitszho.logbook

import androidx.room.TypeConverter
import org.threeten.bp.Duration
import org.threeten.bp.LocalDateTime
import org.threeten.bp.ZoneOffset
import java.util.*

class RoomTypeConverter {
    @TypeConverter
    fun uuidToString(uuid: UUID?): String? = uuid?.toString()

    @TypeConverter
    fun stringToUuid(string: String?): UUID? = string?.let { UUID.fromString(it) }

    @TypeConverter
    fun durationToLong(duration: Duration?): Long? = duration?.toMillis()

    @TypeConverter
    fun longToDuration(long: Long?): Duration? = long?.let { Duration.ofMillis(it) }

    //TODO technically they should not be "Local": they should all be UTC

    @TypeConverter
    fun localDateTimeToString(localDateTime: LocalDateTime?): String? = localDateTime?.toString()

    @TypeConverter
    fun stringToLocalDateTime(string: String?): LocalDateTime? = string?.let { LocalDateTime.parse(it) }

    @TypeConverter
    fun zoneOffsetToString(zoneOffset: ZoneOffset?): String? = zoneOffset?.id

    @TypeConverter
    fun stringToZoneOffset(string: String?): ZoneOffset? = string?.let { ZoneOffset.of(it) }
}