package br.com.denisecastro.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import br.com.denisecastro.delivery.ui.screens.HomeScreen
import br.com.denisecastro.delivery.ui.theme.DeliveryTheme

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
            HomeScreen()
        }
    }
}




