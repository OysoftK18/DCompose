package com.example.dc_ran

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dc_ran.cards.HeroesViewModel

@Composable
fun MyApp(){
    HeroesLoad(viewModel = hiltViewModel())
}

@Composable
fun HeroesLoad(viewModel: HeroesViewModel){
    val heroes = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loadingState == true){
        CircularProgressIndicator()
    }else{
        if (heroes != null){
            Text(text = heroes.first().toString())
        }
    }
}