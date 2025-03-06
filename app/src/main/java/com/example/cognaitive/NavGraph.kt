package com.example.cognaitive

import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

//Insert Route here



fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "ProfileSelectionPage"  // Define where to start
    ) {
        // Add in the params if needed
        composable("ProfileSelectionScreen") { ProfileSelectionScreen(navController = navController) }
        composable("CreateProfileScreen") { CreateProfileScreen(navController = navController) }
        composable("ProfileLandingScreen") { ProfileLandingScreen(navController = navController) }
        composable("CardPairGameScreen") { CardPairGameScreen(navController = navController) }
        composable("MazeGameScreen") { MazeGameScreen(navController = navController) }
        composable("GameResultScreen"){GameResultScreen}

    }
}