package com.example.dc_ran.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.dc_ran.components.inputTextField

@Preview
@Composable
fun HomeScreen() {
    val numberOfPlayers = remember {
        mutableStateOf("")
    }
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.Green)
    ) {
        inputTextField(
            valueState = numberOfPlayers,
            isSingleLIne = true,
            idLabel = "Number of players",
            enabled = true
        )

    }
}