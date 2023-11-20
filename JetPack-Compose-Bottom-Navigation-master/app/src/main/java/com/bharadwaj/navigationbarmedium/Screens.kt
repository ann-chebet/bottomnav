package com.bharadwaj.navigationbarmedium

sealed class Screens(val route : String) {
    object Home: Screens("home_screen")
    object Discover : Screens("Discover_screen")
    object Profile : Screens("profile_screen")
    object Settings : Screens("settings_screen")
    object Me : Screens("me_screen")
}