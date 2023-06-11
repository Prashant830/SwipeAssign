package com.prashant830.swipeassign

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import com.prashant830.swipeassign.Model.productItemX
import com.prashant830.swipeassign.NavigationGraph.NavigationGraph
import com.prashant830.swipeassign.NavigationMenu.BottomNavigation
import com.prashant830.swipeassign.Screens.AllViewModels

class MainActivity : ComponentActivity() {
    val viewModel  by viewModels<AllViewModels>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenView(viewModel.respose , viewModel.resposeTwo , viewModel)
            viewModel.getProductResponse()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreenView(response: List<productItemX> , mess : String  , viewModels: AllViewModels){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController = navController) }
    ) {
        NavigationGraph(navController = navController , response ,mess  , viewModels)
    }
}
