package com.maisyst.maifitness.utility

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.maisyst.maifitness.presentation.screens.Home
import com.maisyst.maifitness.presentation.screens.Login

@Composable
fun NavGraph() {
    val navController= rememberNavController()
    NavHost(navController =navController, startDestination = "/"){
        composable(Screens.Login.route){
            Login()
        }
        composable(Screens.Home.route){
            Home()
        }
    }
}