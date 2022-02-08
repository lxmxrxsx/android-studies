package br.com.cwi.composestudies

import android.location.GnssAntennaInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedDispatcher
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.nio.file.Files.size

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShowList()
        }
    }

    @Composable
    fun SumButton() {
        val scaffoldState = rememberScaffoldState()
        Scaffold(scaffoldState = scaffoldState) {
            var counter by remember {
                mutableStateOf(0)
            }
            Card {
                Column(Modifier.padding(8.dp)) {
                    Text(text = "Aperte no botao a baixo")
                    Button(onClick = { counter++ }) {
                        Text(text = "Aperta vai")
                    }
                    Text(text = counter.toString())
                }
            }
        }

    }

    @Composable
    fun ShowList() {
        val fruitsList = listOf("banana", "pera", "morango")

        Card {
            Column(Modifier.padding(8.dp)) {
                fruitsList.map {
                    Text(text = it, size(20.dp))
                }
            }

        }
    }


}