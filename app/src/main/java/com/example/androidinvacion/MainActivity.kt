package com.example.androidinvacion

import android.R.attr.fontWeight
import android.R.attr.name
import android.graphics.Color.green
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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
                   AndroidInvasion(
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
        .padding(20.dp)) {

        Row(
            modifier = modifier
            .fillMaxWidth(),) {
            Text(
                text = "SCORE: 0050",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xDCFFFFFF),
                textAlign = TextAlign.Left,

            )

            Text(
                text = "LIVES:",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xDCFFFFFF),
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.End

            )

            AndroidEnemy(
                color = Color(0xFF09E310)
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
        painter = painterResource(R.drawable.ic_launcher_background),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "AndroidInvasion"
    )
}

