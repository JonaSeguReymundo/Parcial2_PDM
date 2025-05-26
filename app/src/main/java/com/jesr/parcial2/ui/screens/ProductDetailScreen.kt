package com.jesr.parcial2.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.jesr.parcial2.viewmodel.ProductViewModel

@Composable
fun ProductDetailScreen(navController: NavController, viewModel: ProductViewModel) {
    val product = viewModel.selectedProduct ?: return

    Column(modifier = Modifier.padding(16.dp)) {
        Image(
            painter = rememberAsyncImagePainter(product.image),
            contentDescription = product.name,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(product.name, style = MaterialTheme.typography.titleLarge)
        Text(product.category)
        Text("$${product.price}")
        Spacer(modifier = Modifier.height(8.dp))
        Text(product.description)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            viewModel.toggleCart(product)
            navController.popBackStack()
        }) {
            Text("Agregar al carrito")
        }
    }
}
