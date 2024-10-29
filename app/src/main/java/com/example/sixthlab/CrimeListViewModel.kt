package com.example.sixthlab

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    val crimes: MutableList<Crime> = mutableListOf()

    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes.add(crime)
        }
    }
}
