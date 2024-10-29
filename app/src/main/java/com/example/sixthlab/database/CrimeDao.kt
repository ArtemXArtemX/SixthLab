package com.example.sixthlab

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import java.util.UUID

@Dao
interface CrimeDao {
    @Insert
    fun insert(crime: Crime)

    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id = :id")
    fun getCrimeById(id: UUID): Crime?
}