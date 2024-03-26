package com.youtubeclone.main.mainNavigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable
import javax.annotation.concurrent.Immutable

/**
 * 하단 탭 메뉴에 들어갈 아이템 정보
 * @param text  하단 탭에 표시될 텍스트
 * @param resource  하단 탭 위에 띄워질 에셋
 * @param route  선택시 연결될 Screen route
 */

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
            MainScreenRoute.HOME.route
        )

        @Stable
        internal val BottomShorts: MainTabs = MainTabs(
            "Shots",
            0,
            MainScreenRoute.SHORTS.route
        )

        @Stable
        internal val BottomSubscriptions: MainTabs = MainTabs(
            "Subscriptions",
            0,
            MainScreenRoute.SUBSCRIPTIONS.route
        )

        @Stable
        internal val BottomLibrary: MainTabs = MainTabs(
            "Library",
            0,
            MainScreenRoute.LIBRARY.route
        )
    }
}

