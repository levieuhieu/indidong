package com.indidong.ui.navigation

sealed class Screen(val route: String) {
    data object Dashboard : Screen("dashboard")
    data object Image : Screen("image")
    data object Pdf : Screen("pdf")
    data object Word : Screen("word")
    data object Excel : Screen("excel")
    data object Web : Screen("web")
    data object Printer : Screen("printer")
    data object Settings : Screen("settings")
}
