
package com.example.dc_ran

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.example.dc_ran.cards.CardViewModel
import com.example.dc_ran.cards.RandomizerPicker
import com.example.dc_ran.screens.navigation.ScreenNav
import com.example.dc_ran.ui.theme.DcranTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                val cardsViewModel: CardViewModel by viewModels()
                ScreenNav()
            }
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit){
    DcranTheme() {
        content()
    }
}
