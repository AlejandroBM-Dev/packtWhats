package mx.raiserdev.whatspackt.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun WhatsPacktNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "start_screen"
    ) {

        composable("start_screen") {
            MainScreen(navController)
        }

        composable("chat/{chatId}") { navBackStackEntry ->
            val chatId =
                navBackStackEntry.arguments?.getString("chatId")
            ChatScreen(navController,chatId)
        }
    }
}