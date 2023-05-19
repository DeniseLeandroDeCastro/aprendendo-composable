package br.com.denisecastro.delivery.sampledata

import br.com.denisecastro.delivery.R
import br.com.denisecastro.delivery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hambúrguer",
        price = BigDecimal("12.99"),
        image = R.drawable.hamburguer),
    Product(
        name = "Pizza",
        price = BigDecimal("28.99"),
        image = R.drawable.pizza),
    Product(
        name = "Batata frita",
        price = BigDecimal("8.99"),
        image = R.drawable.batata_frita)
)