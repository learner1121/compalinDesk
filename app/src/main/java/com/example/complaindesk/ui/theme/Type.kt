package com.example.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.example.complaindesk.R

//this is added
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// it is created by self
val AcmeFont = FontFamily(
    Font(
        googleFont = GoogleFont("Acme"),
        fontProvider = provider,
    )
)
// it is created by self
val BenneFont = FontFamily(
    Font(
        googleFont = GoogleFont("Benne"),
        fontProvider = provider,
    )
)

// Default Material 3 typography values
val baseline = Typography()

//(fontFamily = BenneFont), here you can give any font by yourself
// AppTypography is used in the theme file at the end

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = BenneFont),
    displayMedium = baseline.displayMedium.copy(fontFamily = AcmeFont),
    displaySmall = baseline.displaySmall.copy(fontFamily = AcmeFont),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = BenneFont),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = AcmeFont),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = AcmeFont),
    titleLarge = baseline.titleLarge.copy(fontFamily = BenneFont),
    titleMedium = baseline.titleMedium.copy(fontFamily = AcmeFont),
    titleSmall = baseline.titleSmall.copy(fontFamily = AcmeFont),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = BenneFont),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = AcmeFont),
    bodySmall = baseline.bodySmall.copy(fontFamily = AcmeFont),
    labelLarge = baseline.labelLarge.copy(fontFamily = BenneFont),
    labelMedium = baseline.labelMedium.copy(fontFamily = AcmeFont),
    labelSmall = baseline.labelSmall.copy(fontFamily = AcmeFont),
)

