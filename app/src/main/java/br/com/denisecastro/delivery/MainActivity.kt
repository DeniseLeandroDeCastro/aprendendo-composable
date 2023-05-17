package br.com.denisecastro.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.denisecastro.delivery.extensions.toBrazilianCuency
import br.com.denisecastro.delivery.model.Product
import br.com.denisecastro.delivery.ui.components.ProductItem
import br.com.denisecastro.delivery.ui.theme.DeliveryTheme
import br.com.denisecastro.delivery.ui.theme.Purple200
import br.com.denisecastro.delivery.ui.theme.Purple500
import br.com.denisecastro.delivery.ui.theme.Teal200
import java.math.BigDecimal

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    DeliveryTheme {
        Surface {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Spacer(Modifier)
                ProductsSection()
                ProductsSection()
                ProductsSection()
                Spacer(Modifier)
            }
        }
    }
}

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
                    image = R.drawable.hamburguer)
            )
            ProductItem(
                Product(
                    name = "Pizza",
                    price = BigDecimal("28.99"),
                    image = R.drawable.pizza)
            )
            ProductItem(
                Product(
                    name = "Batata frita",
                    price = BigDecimal("8.99"),
                    image = R.drawable.batata_frita)
            )
            Spacer(Modifier)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppPreview() {
    App()
}

@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    ProductsSection()
}




