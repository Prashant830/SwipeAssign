package com.prashant830.swipeassign.NavigationGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prashant830.swipeassign.Model.productItemX
import com.prashant830.swipeassign.NavigationMenu.BottomNavItem
import com.prashant830.swipeassign.Screens.AllViewModels
import com.prashant830.swipeassign.Screens.HomeScreen
import com.prashant830.swipeassign.Screens.SendProductScreen

@Composable
fun NavigationGraph(navController: NavHostController , response : List<productItemX>, mess : String , viewModels: AllViewModels) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_route) {
        composable(BottomNavItem.Home.screen_route) {
            HomeScreen(response)
        }
        composable(BottomNavItem.SendOtp.screen_route) {
            SendProductScreen(mess , viewModels)
        }
    }
}