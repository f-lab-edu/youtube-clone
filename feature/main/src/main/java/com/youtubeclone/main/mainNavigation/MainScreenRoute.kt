package com.youtubeclone.main.mainNavigation

import androidx.annotation.StringRes
import com.youtubeclone.main.R

/**
 * 화면 전환이 추가될때 루트 추가
 */
internal sealed class MainScreenRoute(
    val route: String,
    @StringRes val resourceId: Int,
    //todo resourceId 를 실제 이미 resource 로 변경해야함
) {
    data object Home : MainScreenRoute("home", R.string.home)
    data object Shorts : MainScreenRoute("shorts", R.string.shorts)
    data object Library : MainScreenRoute("library", R.string.library)
    data object Subscriptions : MainScreenRoute("subscriptions", R.string.subscriptions)
}