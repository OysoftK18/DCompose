package com.example.dc_ran.repository

import com.example.dc_ran.cards.Card
import com.example.dc_ran.data.CardsDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CardsRepository @Inject constructor(private val cardsDao: CardsDao){
    fun getAllCards(): Flow<List<Card>> = cardsDao.getAllCards().flowOn(Dispatchers.IO).conflate()
}