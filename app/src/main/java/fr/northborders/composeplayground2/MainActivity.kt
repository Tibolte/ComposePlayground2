package fr.northborders.composeplayground2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import fr.northborders.composeplayground2.ui.theme.ComposePlayground2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Thibault")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(
        modifier = Modifier.background(Color.Green).fillMaxSize(),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = name)
        Text(text = "Android")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting(name = "Thibault")
}