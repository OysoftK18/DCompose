package com.example.dc_ran.data

import com.example.dc_ran.cards.Heroes
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface HeroesDao {
    @GET("Heroes.json")
    suspend fun getHeroes(): Heroes
}