package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(modifier = Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.background) {
                    GreetingText(message = "Happy Birthday Aca!", from = "From Willy", modifier = Modifier.padding(1.dp))
                }
            }
        }
    }
}

//Composable functions MUST be named using Pascal case. Pascal case is the opposite to camel case - you have to start the first word, and every word thereafter, with a capital letter
//Composable functions MUST be a noun. Can't be anything else.
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = message,
            fontSize = 25.sp,
            lineHeight = 1.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(0.dp)
        )
        Text(
            text = from,
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(100.dp).align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Da Boss!", from = "From: Your Mom")
    }
}