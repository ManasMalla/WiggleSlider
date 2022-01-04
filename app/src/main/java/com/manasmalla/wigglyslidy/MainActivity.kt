package com.manasmalla.wigglyslidy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Slider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.manasmalla.wiggleslider.WiggleSlider
import com.manasmalla.wigglyslidy.ui.theme.WigglySlidyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WigglySlidyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Greeting(name: String) {
    Column() {
        var value by remember {
            mutableStateOf(0f)
        }
        WiggleSlider(value = value, onValueChange = {
            value = it
        }, wiggleEnabled = true)
        WiggleSlider(value = value, onValueChange = {
            value = it
        }, wiggleEnabled = false)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WigglySlidyTheme {
        Greeting("Android")
    }
}