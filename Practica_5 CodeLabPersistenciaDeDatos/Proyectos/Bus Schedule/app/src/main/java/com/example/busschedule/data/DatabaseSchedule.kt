package com.example.busschedule.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [BusSchedule::class], version = 1)
abstract class DatabaseSchedule: RoomDatabase() {
    abstract fun busScheduleDao(): BusScheduleDao

    companion object {
        @Volatile
        private var Instance: DatabaseSchedule? = null

        fun getDatabase(context: Context): DatabaseSchedule {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, DatabaseSchedule::class.java, "database_schedule")
                    .createFromAsset("database/bus_schedule.db")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }

            }

        }
    }
}