package com.youtubeclone.main.mainNavigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.designsystem.Black
import com.example.designsystem.White
import com.example.designsystem.YoutubeRed

@Composable
internal fun MainBottomNavigation(
    navigator: MainNavigator
) {
    val icons = bottomTabItems
    Row(
        modifier = Modifier
            .navigationBarsPadding()
            .fillMaxWidth()
            .height(56.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        icons.forEach { it ->
            MainBottomTabItem(tab = it, selected = it.route == navigator.currentRoute) {
                navigator.bottomTabNavigator(it)
            }
        }
    }
}

@Composable
private fun RowScope.MainBottomTabItem(
    tab: MainTabs,
    selected: Boolean,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .clickable(onClick = { onClick() }),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.background(if (selected) YoutubeRed else White)
        ) {
//            Icon(
//                painter = painterResource(tab.resource),
//                contentDescription = tab.text,
//                tint = if (selected) {
//                    //todo
//                    // dark theme 일때는 반대로되야함
//                    // shorts일때는 강제로 darkTheme로 적용
//                    Black
//                } else {
//                    White
//                }
//            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = tab.text)
        }

    }
}


private val bottomTabItems = listOf(
    MainTabs.BottomHome,
    MainTabs.BottomShorts,
    MainTabs.BottomSubscriptions,
    MainTabs.BottomLibrary
)
