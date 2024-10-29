package com.example.sixthlab.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.sixthlab.Crime
import com.example.sixthlab.CrimeDao

@Database(entities = [Crime::class], version = 1, exportSchema = false)
@TypeConverters(CrimeTypeConverters::class)
abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): CrimeDao
}
