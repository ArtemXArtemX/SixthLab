package com.example.sixthlab.database

import androidx.room.Dao
import androidx.room.Query
import java.util.UUID
import com.example.sixthlab.Crime

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?
}