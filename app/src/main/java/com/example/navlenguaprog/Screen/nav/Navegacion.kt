import androidx.compose.foundation.background
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navlenguaprog.Screen.nav.ScreenCmas
import com.example.navlenguaprog.Screen.nav.ScreenInicio
import com.example.navlenguaprog.Screen.nav.ScreenJS
import com.example.navlenguaprog.Screen.nav.ScreenJava
import com.example.navlenguaprog.Screen.nav.ScreenKotlin
import com.example.navlenguaprog.Screen.nav.ScreenMySql

@Composable
fun App() {
    val navController = rememberNavController()

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentRoute != "screen_inicio") {
                BottomNavigationBar(navController = navController)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "screen_inicio",
            modifier = Modifier.padding(innerPadding),
        ) {
            composable("screen_inicio") {
                ScreenInicio(navController)
            }
            composable("screen_kotlin") {
                ScreenKotlin(navController)
            }
            composable("screen_java") {
                ScreenJava(navController)
            }
            composable("screen_js") {
                ScreenJS(navController)
            }
            composable("screen_mysql") {
                ScreenMySql(navController)
            }
            composable("screen_c++") {
                ScreenCmas(navController)
            }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    NavigationBar {
        val items = listOf(
            BottomNavItem("Inicio", "screen_inicio", Icons.Default.Home),
            BottomNavItem("Kotlin", "screen_kotlin", Icons.Default.ArrowDropDown),
            BottomNavItem("Java", "screen_java", Icons.Default.ArrowDropDown),
            BottomNavItem("JS", "screen_js", Icons.Default.ArrowDropDown),
            BottomNavItem("MySQL", "screen_mysql", Icons.Default.ArrowDropDown),
            BottomNavItem("C++", "screen_c++", Icons.Default.ArrowDropDown)
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.label)
                },
                label = { Text(item.label) },
                selected = navController.currentDestination?.route == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = item.route == "screen_inicio"
                        }
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}

data class BottomNavItem(val label: String, val route: String, val icon: ImageVector)
