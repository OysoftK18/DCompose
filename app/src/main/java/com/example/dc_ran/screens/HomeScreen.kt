package com.example.dc_ran.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.dc_ran.components.inputTextField
import com.example.dc_ran.screens.navigation.ScreenNames

@SuppressLint("SuspiciousIndentation")
@Composable
fun HomeScreen(navController: NavController) {

    val nPlayer = remember {
        mutableStateOf("")
    }

    val hasValue = nPlayer.value.trim().isNullOrEmpty()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        inputTextField(
            valueState = nPlayer,
            isSingleLIne = true,
            idLabel = "Number of players",
            enabled = true
        )
        Button(onClick = {
            if (!hasValue)
                navController.navigate(route = ScreenNames.DetailScreen.name + "/${nPlayer.value}")
        }) {
            Text(text = "Start")
        }
    } 
}