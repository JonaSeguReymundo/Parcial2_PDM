package com.jesr.parcial2.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jesr.parcial2.viewmodel.ProductViewModel

@Composable
fun CartScreen(navController: NavController, viewModel: ProductViewModel) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Carrito", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        LazyColumn {
            items(viewModel.cart) { product ->
                Text(product.name)
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text("Volver")
        }
    }
}
