package com.dam2jms.pruebanavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.dam2jms.pruebanavigation.navigation.AppScreens

@Composable
fun firstScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "PRIMERA VENTANA")
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route) }) {
            Text(text = "Navegar")
        }
    }
}