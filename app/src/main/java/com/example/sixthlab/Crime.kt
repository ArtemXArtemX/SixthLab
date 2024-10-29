package com.example.sixthlab

import java.util.Date
import java.util.UUID

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(),
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false
    )
