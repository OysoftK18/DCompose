package com.example.dc_ran.screens.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.dc_ran.screens.DetailScreen
import com.example.dc_ran.screens.HomeScreen

@Composable
fun ScreenNav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenNames.HomeScreen.name) {
        composable(route = ScreenNames.HomeScreen.name) {
            HomeScreen(navController)
        }
        composable(
            route = ScreenNames.DetailScreen.name+"/{nPlayer}",
            arguments = listOf(navArgument("nPlayer") { type = NavType.StringType })
        ) {
            DetailScreen(navController, it.arguments?.getString("nPlayer"))
        }
    }
}