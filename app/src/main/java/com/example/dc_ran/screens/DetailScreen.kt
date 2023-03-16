package com.example.dc_ran.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.dc_ran.ui.theme.DcranTheme

@Composable
fun DetailScreen(navController: NavController, nPlayer: String?){

    BodyDetailScreen {
        Text(text = "Number of players: $nPlayer")
    }
}

@Composable
fun BodyDetailScreen(content: @Composable () -> Unit){
    DcranTheme() {
        content()
    }
}
