package com.example.navlenguaprog.Screen.nav

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ScreenInicio(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "BIENVENIDO...")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("screen_kotlin") }) {
            Text(text = "Kotlin")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("screen_java") }) {
            Text(text = "Java")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("screen_js") }) {
            Text(text = "JavaScript")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("screen_mysql") }) {
            Text(text = "MySql")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("screen_c++") }) {
            Text(text = "C++")
        }
    }
}