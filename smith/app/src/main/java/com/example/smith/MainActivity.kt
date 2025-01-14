package com.example.smith

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.smith.ui.theme.SmithTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            smith()






        }
    }
}

@Composable
@Preview


fun smith(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
//        .background(color.Red),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center







    ){

        Text(text = "Smith",







            color = Color.Blue,
            fontWeight = FontWeight.ExtraBold,
            fontStyle = FontStyle.Italic,








            )

        val images = LocalContext.current
        Button(onClick = { images.startActivity(Intent(images,ImagesActivity::class.java)) }) 
        {
            Text(text = "About")
            
        }

        

























    }




















}