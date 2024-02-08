package com.example.examenparcial1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examenparcial1.ui.theme.ExamenParcial1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenParcial1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PlatilloPozole()
                }
            }
        }
    }
}

@Composable
fun PlatilloPozole() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.cacahuazintle)
        Image(painter = image, contentDescription = null,
            modifier = Modifier
                .size(350.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(end = 20.dp)
        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 1.dp)
                    .size(20.dp)

            )
            Text(
                text = stringResource(R.string.ubicacionnew),
                modifier = Modifier
                    .padding(start = 8.dp),
                color = Color.Gray
            )
        }
        Row(
            modifier = Modifier.padding(top = 25.dp)
        ){

            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = stringResource(R.string.telefono),
                modifier = Modifier
                .padding(start = 8.dp),
                color = Color.Gray
            )
        }
        Row( modifier = Modifier.background(Color.Red)) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp),
                tint = Color.White)

            Text(
                text = stringResource(R.string.llamar),
                color = Color.White
            )
        }
        Row(modifier = Modifier.background(Color.Green)){
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 10.dp)
                    .size(25.dp),
                tint = Color.White
            )
            Text(
                text = stringResource(R.string.whatsapp),
                color = Color.White
            )
        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExamenParcial1Theme {
        PlatilloPozole()
    }
}