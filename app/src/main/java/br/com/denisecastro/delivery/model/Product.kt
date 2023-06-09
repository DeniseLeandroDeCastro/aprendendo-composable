package br.com.denisecastro.delivery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val name: String,
    val price: BigDecimal,
    @DrawableRes val image: Int
)
