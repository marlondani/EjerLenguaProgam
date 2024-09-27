package com.example.navlenguaprog.Screen.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navlenguaprog.R

@Composable
fun ScreenCmas(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(fontWeight = FontWeight.Bold, text = "C++")

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "C++ es un lenguaje de programación de propósito general que se utiliza principalmente para el desarrollo de software de sistemas, aplicaciones de escritorio, juegos y software de alto rendimiento, entre otras aplicaciones.")

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.cmas),
            contentDescription = "Codigo C++",
            modifier = Modifier.fillMaxWidth().height(300.dp),
            contentScale = ContentScale.FillHeight
        )
    }
}