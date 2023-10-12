package com.maisyst.maifitness.utility

sealed class Screens(val route:String){
    data object Home:Screens("/home")
    data object Login:Screens("/")
}
