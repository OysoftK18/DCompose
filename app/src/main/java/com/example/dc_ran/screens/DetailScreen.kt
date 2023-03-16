package com.example.dc_ran.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.dc_ran.ui.theme.DcranTheme
import com.example.dc_ran.widgets.CustomPlayerView

@Composable
fun DetailScreen(navController: NavController, nPlayer: String?){

    BodyDetailScreen {
        Text(text = "Number of players: $nPlayer")
        CustomPlayerView(nPlayer?.toInt()!!, )
    }
}

@Composable
fun BodyDetailScreen(content: @Composable () -> Unit){
    DcranTheme() {
        content()
    }
}
