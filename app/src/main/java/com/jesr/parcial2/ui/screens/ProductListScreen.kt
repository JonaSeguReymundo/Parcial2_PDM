package com.jesr.parcial2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jesr.parcial2.viewmodel.ProductViewModel
import com.jesr.parcial2.navigation.Screen
import com.jesr.parcial2.ui.components.ProductCard

@Composable
fun ProductListScreen(navController: NavController, viewModel: ProductViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        TextField(
            value = viewModel.searchQuery,
            onValueChange = { viewModel.searchQuery = it },
            label = { Text("Buscar productos") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn {
            items(viewModel.filteredProducts) { product ->
                ProductCard(product) {
                    viewModel.selectedProduct = product
                    navController.navigate(Screen.ProductDetail.route)
                }
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { navController.navigate(Screen.Cart.route) }) {
            Text("Ver Carrito")
        }
    }
}
