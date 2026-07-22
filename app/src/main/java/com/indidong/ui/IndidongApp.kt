package com.indidong.ui

import androidx.compose.runtime.Composable
import com.indidong.ui.navigation.AppNavigation
import com.indidong.ui.theme.IndidongTheme

@Composable
fun IndidongApp() {
    IndidongTheme {
        AppNavigation()
    }
}
