package com.example.dc_ran

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dc_ran.cards.HeroesViewModel
import com.example.dc_ran.cards.cardsPerPlayer

@Composable
fun MyApp(nPlayers: Int = 2){
    HeroesLoad(viewModel = hiltViewModel(), nPlayers)
}
//Falta pasarle una lista con los heroes ya en uso.
@Composable
fun HeroesLoad(viewModel: HeroesViewModel, nPlayers: Int){
    val heroes = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loadingState == true){
        CircularProgressIndicator()
    }else{
        if (heroes != null){
            println(heroes.toString())
        }
    }
}