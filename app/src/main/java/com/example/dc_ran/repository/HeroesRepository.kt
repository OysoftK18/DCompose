package com.example.dc_ran.repository

import android.util.Log
import com.example.dc_ran.cards.HeroesItem
import com.example.dc_ran.components.DataOrException
import com.example.dc_ran.data.HeroesDao
import javax.inject.Inject

class HeroesRepository @Inject constructor(private val heroesDao: HeroesDao) {
    val dataOrException = DataOrException<ArrayList<HeroesItem>,Boolean,Exception>()

    suspend fun getAllHeroes(): DataOrException<ArrayList<HeroesItem>,Boolean,Exception>{
        try {
            dataOrException.loadingState = true
            dataOrException.data = heroesDao.getHeroes()
            if (dataOrException.data.toString().isNotEmpty()) dataOrException.loadingState = false
        }catch (exception: Exception){
            dataOrException.exception = exception
            Log.e("Exception loading heroes:", "$exception")
        }
        return dataOrException
    }
}