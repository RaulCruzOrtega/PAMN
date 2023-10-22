package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        val image = painterResource(R.drawable.user_icon_2_svg)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                        .height(100.dp)
                        .width(100.dp)
        )
        Text(
            text = stringResource(R.string.nombre),
            fontSize = 40.sp,
            modifier = modifier.padding(bottom = 0.dp)
        )
        Text(
            text = stringResource(R.string.title),
            fontSize = 20.sp,
            modifier = modifier.padding(top = 0.dp)
        )
    }
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(bottom = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom) {
        Row ( modifier = modifier.padding(bottom = 10.dp)) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                modifier = modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.phone_number),
                fontSize = 20.sp,
                modifier = modifier.padding(top = 0.dp)
            )
        }
        Row (modifier = modifier.padding(bottom = 10.dp)) {
            Icon(
                Icons.Rounded.Search,
                contentDescription = null,
                modifier = modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.socialmedia),
                fontSize = 20.sp,
                modifier = modifier.padding(top = 0.dp)
            )
        }
        Row (modifier = modifier.padding(bottom = 10.dp)) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = modifier.padding(end = 10.dp)
            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 20.sp,
                modifier = modifier.padding(top = 0.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Greeting()
    }
}