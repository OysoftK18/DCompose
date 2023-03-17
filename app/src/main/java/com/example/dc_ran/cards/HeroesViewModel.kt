package com.example.dc_ran.cards

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dc_ran.components.DataOrException
import com.example.dc_ran.repository.HeroesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HeroesViewModel @Inject constructor(private val repository: HeroesRepository): ViewModel(){
    val data: MutableState<DataOrException<ArrayList<HeroesItem>,Boolean, Exception>> =
        mutableStateOf(DataOrException(null,false,Exception("")))

    init {
        getAllHeroes()
    }

    private fun getAllHeroes() {
        viewModelScope.launch{
            data.value.loadingState = true
            data.value = repository.getAllHeroes()
            if(data.value.toString().isNotEmpty())
                data.value.loadingState = false
        }
    }

}