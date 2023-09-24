package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InitialImage(name =  "Jon y Raul", positionJob = "Android developer" )
                    BottomText(phone = "+32 435852603", email = "FrancoRodriguez@gmail.com", street = "Francos Rodriguez 106")

                }
            }
        }
    }
}

@Composable
fun InitialText(name: String, positionJob: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(8.dp),
    ){
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .padding(bottom = 8.dp)
        )
        Text(
            text = name,
            fontSize = 50.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Text(
            text = positionJob,
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
            color = Color.White

        )
    }
}

@Composable
fun BottomText(phone: String, email: String,street:String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().padding(8.dp),
    ) {
        Text(
            text = phone,
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 4.dp),
            color = Color.White
        )
        Text(
            text = email,
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 4.dp),
            color = Color.White
        )
        Text(
            text = street,
            fontSize = 26.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 4.dp),
            color = Color.White


            )
    }
}

@Composable
fun InitialImage(name: String, positionJob: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fondo)
    Box {

        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        InitialText(
            name = name,
            positionJob = positionJob,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),

            )
    }
}