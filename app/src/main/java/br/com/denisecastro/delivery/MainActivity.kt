package br.com.denisecastro.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.denisecastro.delivery.ui.theme.DeliveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "My first composable")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column {
        Text(text = "Column 1")
        Text(text = "Column 2")
        Row {
            Text(text = "Row 1")
            Text(text = "Row 2")
        }
        Box {
            Row {
                Text(text = "Row dentro de Box 1")
                Text(text = "Row dentro de Box 2")
            }
            Column {
                Text(text = "Column dentro de Box 1")
                Text(text = "Column dentro de Box 2")
            }
        }
    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview
@Composable
fun MyFirstComposablePreview() {
    DeliveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}