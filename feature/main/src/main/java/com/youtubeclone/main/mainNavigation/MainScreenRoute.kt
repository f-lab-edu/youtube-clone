package com.youtubeclone.main.mainNavigation

import androidx.annotation.StringRes
import com.youtubeclone.main.R

/**
 * 화면 전환이 추가될때 루트 추가
 */

internal enum class MainScreenRoute(
    val route: String,
) {
    HOME("home"),
    SHORTS("shorts"),
    LIBRARY("library"),
    SUBSCRIPTIONS("subscriptions")
}