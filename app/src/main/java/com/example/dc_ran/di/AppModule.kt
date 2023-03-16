package com.example.dc_ran.di

import android.content.Context
import androidx.room.Room
import com.example.dc_ran.data.CardsDao
import com.example.dc_ran.data.CardsDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideCardsDao(cadsDatabase: CardsDataBase): CardsDao = cadsDatabase.cardsDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): CardsDataBase =
        Room.databaseBuilder(context, CardsDataBase::class.java, name = "cards_db")
            .fallbackToDestructiveMigration()
            .build()

}