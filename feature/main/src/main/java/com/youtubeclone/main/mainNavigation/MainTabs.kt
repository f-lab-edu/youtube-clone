package com.youtubeclone.main.mainNavigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable
import javax.annotation.concurrent.Immutable

@Immutable
data class MainTabs(
    val text: String,
    @DrawableRes val resource: Int,
    val route: String
) {
    companion object {
        //todo resource asset
        @Stable
        internal val BottomHome: MainTabs = MainTabs(
            "Home",
            0,
            MainScreenRoute.Home.route
        )

        @Stable
        internal val BottomShorts: MainTabs = MainTabs(
            "Shots",
            0,
            MainScreenRoute.Shorts.route
        )

        @Stable
        internal val BottomSubscriptions: MainTabs = MainTabs(
            "Subscriptions",
            0,
            MainScreenRoute.Subscriptions.route
        )

        @Stable
        internal val BottomLibrary: MainTabs = MainTabs(
            "Library",
            0,
            MainScreenRoute.Library.route
        )
    }
}

