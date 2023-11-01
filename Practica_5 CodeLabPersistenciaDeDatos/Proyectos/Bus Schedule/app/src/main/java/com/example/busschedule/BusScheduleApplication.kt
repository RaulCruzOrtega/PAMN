package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.DatabaseSchedule

class BusScheduleApplication: Application() {
    val database: DatabaseSchedule by lazy { DatabaseSchedule.getDatabase(this) }
}