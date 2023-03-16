package com.example.dc_ran.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.dc_ran.cards.Card
import com.example.dc_ran.utils.UUIDConverter

@Database(entities = [Card::class], version = 1, exportSchema = false)
@TypeConverters(UUIDConverter::class)
abstract class CardsDataBase: RoomDatabase(){
    abstract fun cardsDao(): CardsDao
}