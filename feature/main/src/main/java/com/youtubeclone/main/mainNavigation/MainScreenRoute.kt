package com.youtubeclone.main.mainNavigation

import androidx.annotation.StringRes
import com.youtubeclone.main.R
import java.util.Locale

/**
 * 화면 전환이 추가될때 루트 추가
 */

internal enum class MainScreenRoute {
    HOME,
    SHORTS,
    LIBRARY,
    SUBSCRIPTIONS;
    val route: String
        get() = this.name.lowercase(Locale.ROOT)
}