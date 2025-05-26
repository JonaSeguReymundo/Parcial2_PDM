package com.jesr.parcial2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.jesr.parcial2.viewmodel.ProductViewModel
import com.jesr.parcial2.ui.screens.CartScreen
import com.jesr.parcial2.ui.screens.ProductDetailScreen
import com.jesr.parcial2.ui.screens.ProductListScreen

sealed class Screen(val route: String) {
    object ProductList : Screen("product_list")
    object ProductDetail : Screen("product_detail")
    object Cart : Screen("cart")
}

@Composable
fun AppNavigation(viewModel: ProductViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.ProductList.route) {
        composable(Screen.ProductList.route) {
            ProductListScreen(navController, viewModel)
        }
        composable(Screen.ProductDetail.route) {
            ProductDetailScreen(navController, viewModel)
        }
        composable(Screen.Cart.route) {
            CartScreen(navController, viewModel)
        }
    }
}
