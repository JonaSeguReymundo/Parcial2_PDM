package com.jesr.parcial2.viewmodel

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import com.jesr.parcial2.data.Product

class ProductViewModel : ViewModel() {
    private val _products = mutableStateListOf<Product>(
        // Zapatos
        Product(1, "Nike Air Force 1", "Zapatos", 119.99, "Clásico urbano con diseño limpio y durabilidad.", "https://m.media-amazon.com/images/I/813xBjiwt3L._AC_UY300_.jpg"),
        Product(2, "Nike Air Max 90", "Zapatos", 139.99, "Diseño retro con amortiguación Air visible.", "https://images-cdn.ubuy.sv/6356aa056ceada1982547707-new-nike-air-max-90-shoes-dc9388-003.jpg"),
        Product(3, "Nike Dunk Low", "Zapatos", 109.99, "Diseño clásico del skate con estilo urbano.", "https://www.libertysv.com/cdn/shop/files/dd1873-103_phcfh001-1000_1200x1200.webp?v=1728582749"),
        Product(4, "Nike Waffle One", "Zapatos", 104.99, "Estilo retro running con suela waffle duradera.", "https://static.wixstatic.com/media/050cdb_412e29e3c47d450798a6831b9e260497~mv2.jpg/v1/fit/w_500,h_500,q_90/file.jpg"),
        Product(5, "Nike SB Chron 2", "Zapatos", 74.99, "Modelo para skate con estilo relajado.", "https://www.libertysv.com/cdn/shop/products/DM3493-001-web-2_1024x1024.jpg?v=1665261887"),
        // Camisas
        Product(6, "Nike Sportswear Club Tee", "Camisas", 34.99, "Camiseta de algodón suave con logo clásico.", "https://www.jeanjail.com.au/cdn/shop/products/Nike-Sportswear-Club-Tee-White-f1jpg.jpg?v=1699833178&width=1300"),
        Product(7, "Nike Dri-FIT Legend", "Camisas", 29.99, "Camiseta de entrenamiento con tecnología que absorbe el sudor.", "https://i5.walmartimages.com/seo/Nike-Men-s-Dri-Fit-Legend-Fitness-T-Shirt_53b6a60a-73bb-43ef-be94-001d546195c3.e6f12c07b0fad6037a6fb984e960868e.jpeg"),
        Product(8, "Nike Pro Fitted", "Camisas", 39.99, "Ajustada y ligera, ideal para entrenamientos intensos.", "https://m.media-amazon.com/images/I/41v8Tkd1f1L._AC_UY1000_.jpg"),
        Product(9, "Nike ACG Tee", "Camisas", 44.99, "Diseño para aventura con estilo urbano.", "https://i8.amplience.net/i/jpl/sz_599284_a?qlt=92&w=600&h=464&v=1&fmt=auto"),
        Product(10, "Nike Jordan Jumpman Tee", "Camisas", 39.99, "Diseño clásico con logo Jumpman.", "https://www.shopwss.com/cdn/shop/files/95A873001_1.jpg?v=1740610957"),
        // Calcetines
        Product(11, "Nike Everyday Crew 3-Pack", "Calcetines", 19.99, "Calcetines cómodos para uso diario.", "https://img01.ztat.net/article/spp-media-p1/0015446e527246a8897f8d69cc0e968d/eb44867b3a1a434dbcc7341bcae1278c.jpg?imwidth=1800&filter=packshot"),
        Product(12, "Nike Elite Crew", "Calcetines", 16.99, "Amortiguación y soporte para deportes intensos.", "https://sportland.com/media/catalog/product/cache/45d29c4f3d7825954b7edd35f17b2846/S/X/SX7622_100_f185.jpg"),
        Product(13, "Nike No-Show Socks 3-Pack", "Calcetines", 14.99, "Diseño bajo invisible con ajuste firme.", "https://m.media-amazon.com/images/I/81j274-cPpL._AC_UY1000_.jpg"),
        Product(14, "Nike Dri-FIT Cushion", "Calcetines", 17.99, "Mantiene tus pies secos durante el entrenamiento.", "https://m.media-amazon.com/images/I/61Z9+l2VotL._AC_UF894,1000_QL80_.jpg"),
        Product(15, "Nike Multiplier Running", "Calcetines", 19.99, "Para corredores que necesitan soporte en largas distancias.", "https://www.ekinsport.com/media/opti_image/webp/catalog/product/cache/ab26c22a655754f041e4ec1ba42dece0/s/x/sx7557-100_lot-de-chaussettes-nike-blanc-sx7557-100_05_1.webp"),
        // Shorts
        Product(16, "Nike Dri-FIT Challenger", "Shorts", 39.99, "Shorts para correr ligeros y cómodos.", "https://static.nike.com/a/images/t_PDP_936_v1/f_auto,q_auto:eco/0cf5b328-11ba-4344-b24d-7baeb26f1b1e/AS+M+NK+DF+CHALLENGER+72IN1+SH.png"),
        Product(17, "Nike Sportswear Club", "Shorts", 44.99, "Estilo casual para uso diario.", "https://www.nike.sa/dw/image/v2/BDVB_PRD/on/demandware.static/-/Sites-akeneo-master-catalog/default/dwac6c6214/nk/84c/4/7/f/8/6/84c47f86_0bd0_427e_899a_4a5434fcc2ae.jpg?sw=700&sh=700&sm=fit&q=100&strip=false"),
        Product(18, "Nike Pro Compression", "Shorts", 34.99, "Compresión para entrenamientos de alto rendimiento.", "https://www.uscbookstore.com/SSP%20Applications/NetSuite%20Inc.%20-%20SCS/SuiteCommerce%20Standard/product-images/0003008185_Black-1.jpg"),
        Product(19, "Nike Flex Woven", "Shorts", 49.99, "Shorts flexibles para entrenamiento o descanso.", "https://m.media-amazon.com/images/I/3141qKUon3L._AC_UY1000_.jpg"),
        Product(20, "Nike Jordan Diamond Shorts", "Shorts", 54.99, "Diseño Jordan con inspiración en la cancha.", "https://www.nike.sa/dw/image/v2/BDVB_PRD/on/demandware.static/-/Sites-akeneo-master-catalog/default/dw9581df4a/nk/30b/1/d/5/a/a/30b1d5aa_138e_4c34_a704_74bbcdfcba92.jpg?sw=2000&sh=2000&sm=fit"),
        // Hoodies
        Product(21, "Nike Club Fleece Hoodie", "Hoodies", 64.99, "Sudadera con capucha suave y clásica.", "https://m.media-amazon.com/images/I/41MlPYMFNPL._AC_UY1000_.jpg"),
        Product(22, "Nike Tech Fleece Hoodie", "Hoodies", 119.99, "Diseño moderno y cálido con ajuste perfecto.", "https://static.nike.com/a/images/t_PDP_936_v1/f_auto,q_auto:eco/5a03f66d-7f9d-45bb-a136-a5d839a950c9/M+NK+TCH+FLC+FZ+WR+HOODIE.png"),
        Product(23, "Nike ACG Therma-FIT", "Hoodies", 129.99, "Diseñada para climas fríos con tecnología aislante.", "https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/d3305a77-42f8-4b73-a1e3-60999a705426/U+ACG+TF+TUFF+FLC+PO+HOODIE.png"),
        Product(24, "Nike Jordan Essentials", "Hoodies", 74.99, "Estilo icónico con logo Jumpman bordado.", "https://m.media-amazon.com/images/I/6148qjOdjuL._AC_UY1000_.jpg"),
        Product(25, "Nike Sportswear Swoosh Hoodie", "Hoodies", 84.99, "Logo grande al frente y diseño oversize moderno.", "https://m.media-amazon.com/images/I/71hdK5D1zBL._AC_UY1000_.jpg")
        )

    var searchQuery by mutableStateOf("")
    var selectedProduct by mutableStateOf<Product?>(null)

    val products: List<Product> get() = _products

    val filteredProducts: List<Product>
        get() = if (searchQuery.isBlank()) _products
        else _products.filter {
            it.name.contains(searchQuery, true) || it.category.contains(searchQuery, true)
        }

    val cart: List<Product> get() = _products.filter { it.addedToCart }

    fun toggleCart(product: Product) {
        val index = _products.indexOfFirst { it.id == product.id }
        if (index != -1) {
            _products[index] = _products[index].copy(addedToCart = !_products[index].addedToCart)
        }
    }
}