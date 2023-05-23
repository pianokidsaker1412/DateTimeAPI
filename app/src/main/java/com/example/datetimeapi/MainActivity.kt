package com.example.datetimeapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.datetimeapi.ui.theme.DateTimeAPITheme
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DateTimeAPITheme {
                // A surface container using the 'background' color from the theme
                val date = remember {
                    LocalDateTime.now()
                }
                val dateTimeFormatted = remember {
                        DateTimeFormatter
                            .ofPattern("dd mm yyyy HH:mm:ss")
                            .format(date)
                }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text ="Ngay va gio la: " + dateTimeFormatted)
                }
            }
        }
    }
}