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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.navlenguaprog.R

@Composable
fun ScreenKotlin(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
      Text(fontWeight = FontWeight.Bold, text = "Kotlin")

      Spacer(modifier = Modifier.height(16.dp))

      Text(text = "Kotlin es un lenguaje de programación de código abierto creado por JetBrains que se ha popularizado gracias a que se puede utilizar para programar aplicaciones Android.")

      Spacer(modifier = Modifier.height(16.dp))

      Image(
          painter = painterResource(id = R.drawable.kotlin),
          contentDescription = "Codigo Kotlin",
          modifier = Modifier.fillMaxWidth().height(300.dp),
          contentScale = ContentScale.FillHeight
        )
    }
}