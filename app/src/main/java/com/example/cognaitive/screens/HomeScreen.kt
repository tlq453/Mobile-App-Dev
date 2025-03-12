package com.example.cognaitive.screens

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.cognaitive.R
import com.example.cognaitive.Screen
import com.example.cognaitive.customUI.NormalBlueButton
import com.example.cognaitive.customUI.CustomTextHeader
import com.example.cognaitive.ui.theme.sky_blue

@Composable
fun HomeScreen(
    navController: NavController = rememberNavController()
) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .background(sky_blue)
                .fillMaxSize()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.6f)
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                CustomTextHeader(
                    text = "CognAltive",
                    fontSize = 64.sp
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.4f)
                    .fillMaxSize()
            ) {
                NormalBlueButton(
                    text = "Play",
                    onClick = {
                        navController.navigate(Screen.ProfileSelectionScreen.route)
                    }
                )
            }
        }
    }
}