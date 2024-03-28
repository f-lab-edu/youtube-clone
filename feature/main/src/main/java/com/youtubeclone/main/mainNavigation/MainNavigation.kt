package com.youtubeclone.main.mainNavigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navOptions
import com.example.home.HomeScreen
import com.example.library.LibraryScreen
import com.youtubeclone.shorts.ShortsScreen
import com.youtubeclone.subscribe.SubscriptionsScreen

internal class MainNavigator(
    private val navController: NavHostController
) {
    @Composable
    fun MainNavigation(
        paddingValues: PaddingValues
    ) {
        NavHost(
            navController = navController,
            startDestination = MainScreenRoute.HOME.route
        ) {
            composable(
                route = MainScreenRoute.HOME.route
            ) {
                HomeScreen()
            }

            composable(
                route = MainScreenRoute.SHORTS.route
            ) {
                ShortsScreen()
            }

            composable(
                route = MainScreenRoute.LIBRARY.route
            ) {
                LibraryScreen()
            }

            composable(
                route = MainScreenRoute.SUBSCRIPTIONS.route
            ) {
                SubscriptionsScreen()
            }
        }
    }

    fun bottomTabNavigator(tab: MainTabs) {
        val navOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (tab) {
            MainTabs.BottomHome -> navController.navigate(MainScreenRoute.HOME.route)
            MainTabs.BottomShorts -> navController.navigate(MainScreenRoute.SHORTS.route)
            MainTabs.BottomSubscriptions -> navController.navigate(MainScreenRoute.SUBSCRIPTIONS.route)
            MainTabs.BottomLibrary -> navController.navigate(MainScreenRoute.LIBRARY.route)
        }
    }

    val currentRoute = navController.currentBackStackEntry?.destination?.route

    fun backPress() {
        navController.popBackStack()
    }
}
