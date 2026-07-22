package com.indidong.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Define colors
private val primaryLight = Color(0xFF6750A4)
private val onPrimaryLight = Color(0xFFFFFFFF)
private val primaryContainerLight = Color(0xFFEADDFF)
private val onPrimaryContainerLight = Color(0xFF21005D)

private val secondaryLight = Color(0xFF625B71)
private val onSecondaryLight = Color(0xFFFFFFFF)
private val secondaryContainerLight = Color(0xFFE8DEF8)
private val onSecondaryContainerLight = Color(0xFF1D192B)

private val tertiaryLight = Color(0xFF7D5260)
private val onTertiaryLight = Color(0xFFFFFFFF)
private val tertiaryContainerLight = Color(0xFFFFD8E4)
private val onTertiaryContainerLight = Color(0xFF31111D)

private val errorLight = Color(0xFFB3261E)
private val onErrorLight = Color(0xFFFFFFFF)
private val errorContainerLight = Color(0xFFF9DEDC)
private val onErrorContainerLight = Color(0xFF410E0B)

private val backgroundLight = Color(0xFFFFFBFE)
private val onBackgroundLight = Color(0xFF1C1B1F)
private val surfaceLight = Color(0xFFFFFBFE)
private val onSurfaceLight = Color(0xFF1C1B1F)
private val surfaceVariantLight = Color(0xFFE7E0EC)
private val onSurfaceVariantLight = Color(0xFF49454E)
private val outlineLight = Color(0xFF79747E)
private val outlineVariantLight = Color(0xFFCAC7D0)
private val scrimLight = Color(0xFF000000)

// Dark scheme colors
private val primaryDark = Color(0xFFD0BCFF)
private val onPrimaryDark = Color(0xFF371E73)
private val primaryContainerDark = Color(0xFF4F378B)
private val onPrimaryContainerDark = Color(0xFFEADDFF)

private val secondaryDark = Color(0xFFCCC7F0)
private val onSecondaryDark = Color(0xFF332D41)
private val secondaryContainerDark = Color(0xFF4A4458)
private val onSecondaryContainerDark = Color(0xFFE8DEF8)

private val tertiaryDark = Color(0xFFFFB8C8)
private val onTertiaryDark = Color(0xFF492532)
private val tertiaryContainerDark = Color(0xFF633B48)
private val onTertiaryContainerDark = Color(0xFFFFD8E4)

private val errorDark = Color(0xFFF2B8B5)
private val onErrorDark = Color(0xFF601410)
private val errorContainerDark = Color(0xFF8C1d18)
private val onErrorContainerDark = Color(0xFFF9DEDC)

private val backgroundDark = Color(0xFF1C1B1F)
private val onBackgroundDark = Color(0xFFE6E1E6)
private val surfaceDark = Color(0xFF1C1B1F)
private val onSurfaceDark = Color(0xFFE6E1E6)
private val surfaceVariantDark = Color(0xFF49454E)
private val onSurfaceVariantDark = Color(0xFFCAC7D0)
private val outlineDark = Color(0xFF938F99)
private val outlineVariantDark = Color(0xFF49454E)
private val scrimDark = Color(0xFF000000)

private val lightColorScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
)

private val darkColorScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
)

@Composable
fun IndidongTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkColorScheme
        else -> lightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = IndidongTypography,
        content = content
    )
}

// Don't forget to import isSystemInDarkTheme
import androidx.compose.foundation.isSystemInDarkTheme
