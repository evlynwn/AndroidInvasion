package com.example.androidinvacion

import android.R.attr.fontWeight
import android.R.attr.name
import android.R.attr.text
import android.graphics.Color.green
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.key.Key.Companion.I
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidinvacion.ui.theme.AndroidInvacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidInvacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   TelaGameOver(
                        modifier = Modifier
                           .padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun AndroidInvasion(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(0xFF000000))
    ) {

        Row(
            modifier = modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Text(
                text = "SCORE: 0050",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xDCFFFFFF),
                textAlign = TextAlign.Left,

            )

            Row() {
                Text(
                    text = "LIVES:",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xDCFFFFFF),
                    textAlign = TextAlign.End
                )
                AndroidEnemy(
                    color = Color.Green,
                    modifier = Modifier.size(20.dp)
                )
                AndroidEnemy(
                    color = Color.Green,
                    modifier = Modifier.size(20.dp)
                )
                AndroidEnemy(
                    color = Color.Green,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidEnemy(
                modifier = Modifier.size(70.dp),
                color = Color.Green
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp)
                ,color = Color.Red
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp)
                , color = Color.Blue
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp)
                ,color = Color.Yellow
            )
            AndroidEnemy(
                modifier = Modifier.size(70.dp)
                , color = Color.Green
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.5f)
               //.background(Color.Gray)
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ){
            Image(
                modifier = Modifier.size(70.dp),
                painter = painterResource(R.drawable.jetpack_removebg_preview),
                contentDescription = "Jetpack"
            )

            Text(
                modifier = Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .padding(12.dp),
                text = "PRESS START",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xDCFFFFFF),
                textAlign = TextAlign.Center,
            )
        }
    }
}
@Composable
fun AndroidEnemy(
    color: Color,
    modifier: Modifier = Modifier
){
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.android_icon),
        colorFilter = ColorFilter.tint(color),
        contentDescription = "AndroidInvasion"
    )
}

@Composable
fun EnemiesRow (
    modifier: Modifier = Modifier
){
    AndroidEnemy(
        modifier = Modifier.size(70.dp),
        color = Color.Green
    )
    AndroidEnemy(
        modifier = Modifier.size(70.dp)
        ,color = Color.Red
    )
    AndroidEnemy(
        modifier = Modifier.size(70.dp)
        , color = Color.Blue
    )
    AndroidEnemy(
        modifier = Modifier.size(70.dp)
        ,color = Color.Yellow
    )
    AndroidEnemy(
        modifier = Modifier.size(70.dp)
        , color = Color.Green
    )

}

@Composable
fun TelaGameOver(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000000)),
        contentAlignment = Alignment.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            EnemiesRow()
        }

        Text(
            modifier = Modifier.padding(0.dp,43.dp, 0.dp, 0.dp),
            text = "GAME OVER",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xDCFFFFFF)
        )

    }


}
