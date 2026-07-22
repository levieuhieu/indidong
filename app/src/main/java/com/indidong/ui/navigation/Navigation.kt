package com.indidong.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.indidong.ui.screens.dashboard.DashboardScreen
import com.indidong.ui.screens.image.ImageScreen
import com.indidong.ui.screens.pdf.PdfScreen
import com.indidong.ui.screens.word.WordScreen
import com.indidong.ui.screens.excel.ExcelScreen
import com.indidong.ui.screens.web.WebScreen
import com.indidong.ui.screens.printer.PrinterScreen
import com.indidong.ui.screens.settings.SettingsScreen

@Composable
fun AppNavigation(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(Screen.Dashboard.route) {
            DashboardScreen(navController = navController)
        }
        composable(Screen.Image.route) {
            ImageScreen(navController = navController)
        }
        composable(Screen.Pdf.route) {
            PdfScreen(navController = navController)
        }
        composable(Screen.Word.route) {
            WordScreen(navController = navController)
        }
        composable(Screen.Excel.route) {
            ExcelScreen(navController = navController)
        }
        composable(Screen.Web.route) {
            WebScreen(navController = navController)
        }
        composable(Screen.Printer.route) {
            PrinterScreen(navController = navController)
        }
        composable(Screen.Settings.route) {
            SettingsScreen(navController = navController)
        }
    }
}
