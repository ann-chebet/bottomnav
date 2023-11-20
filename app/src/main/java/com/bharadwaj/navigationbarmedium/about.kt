package com.bharadwaj.navigationbarmedium

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.bharadwaj.navigationbarmedium.ui.theme.NavigationBarMediumTheme

class about : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ann()

        }
    }
}

@Preview(showBackground = true)


@Composable
fun Ann(){

    val goto= LocalContext.current


    Column {


        Text("back", fontSize = 20.sp, color = Color.Blue, modifier = Modifier
            .clickable { goto.startActivity(Intent(goto, MainActivity::class.java)) })

    }
}