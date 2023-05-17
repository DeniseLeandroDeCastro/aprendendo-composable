package br.com.denisecastro.delivery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.delivery.R.*
import br.com.denisecastro.delivery.model.Product
import java.math.BigDecimal

@Composable
fun ProductsSection() {
    Column {
        Text(
            text = "Promoções",
            Modifier.padding(start = 16.dp, end = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(top = 8.dp)
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(Modifier)
            ProductItem(
                Product(
                    name = "Hambúrguer",
                    price = BigDecimal("12.99"),
                    image = drawable.hamburguer)
            )
            ProductItem(
                Product(
                    name = "Pizza",
                    price = BigDecimal("28.99"),
                    image = drawable.pizza)
            )
            ProductItem(
                Product(
                    name = "Batata frita",
                    price = BigDecimal("8.99"),
                    image = drawable.batata_frita)
            )
            Spacer(Modifier)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection()
}