package com.indidong.ui.screens.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.indidong.ui.navigation.Screen

data class MenuItemData(
    val title: String,
    val route: String,
    val icon: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavHostController) {
    val menuItems = listOf(
        MenuItemData("In Ảnh", Screen.Image.route, "📷"),
        MenuItemData("In PDF", Screen.Pdf.route, "📄"),
        MenuItemData("In Word", Screen.Word.route, "📝"),
        MenuItemData("In Excel", Screen.Excel.route, "📊"),
        MenuItemData("In Website", Screen.Web.route, "🌐"),
        MenuItemData("Máy In", Screen.Printer.route, "🖨️"),
        MenuItemData("Cài Đặt", Screen.Settings.route, "⚙️"),
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("indidong") })
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Chào mừng đến với indidong",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                textAlign = TextAlign.Center
            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(menuItems.size) { index ->
                    val item = menuItems[index]
                    DashboardMenuItem(
                        title = item.title,
                        icon = item.icon,
                        onClick = {
                            navController.navigate(item.route)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun DashboardMenuItem(
    title: String,
    icon: String,
    onClick: () -> Unit
) {
    ElevatedCard(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = icon,
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center
            )
        }
    }
}
