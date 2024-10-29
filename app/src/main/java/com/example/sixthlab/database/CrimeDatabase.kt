package com.example.sixthlab.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.sixthlab.Crime

class CrimeDatabase {
    @Database(entities = [ Crime::class ], version=1)
    abstract class CrimeDatabase : RoomDatabase() {
    }
}