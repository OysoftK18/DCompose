package com.example.dc_ran.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.dc_ran.cards.Card
import kotlinx.coroutines.flow.Flow

@Dao
interface CardsDao {

    @Query("SELECT * FROM Table_Cards")
    fun getAllCards(): Flow<List<Card>>

}