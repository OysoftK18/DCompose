package com.example.dc_ran.utils

import androidx.room.TypeConverter
import java.util.*

class UUIDConverter {
    @TypeConverter
    fun fromUUID(uuid: UUID): String?{
        return uuid.toString()
    }
    @TypeConverter
    fun fromString(string: String?): UUID?{
        return UUID.fromString(string)
    }
}