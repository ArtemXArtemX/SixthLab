package com.example.sixthlab

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

@Entity(tableName = "crime")
class Crime {
    @PrimaryKey
    var id: UUID
    var title: String
    var date: Date
    var isSolved: Boolean

    constructor(
        id: UUID,
        title: String,
        date: Date,
        isSolved: Boolean
    ) {
        this.id = id
        this.title = title
        this.date = date
        this.isSolved = isSolved
    }

    constructor() {
        this.id = UUID.randomUUID()
        this.title = ""
        this.date = Date()
        this.isSolved = false
    }
}