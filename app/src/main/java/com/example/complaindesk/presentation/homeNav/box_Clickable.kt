package com.example.complaindesk.presentation.homeNav

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun box_Clickable(navController: NavController){
    Box(modifier = Modifier.padding(8.dp)
        .size(100.dp)
        .clickable { navController.navigate("Feedback") }
        .background(Color.Green)
    ) {

Text("hello",
    modifier = Modifier,
    Color.Red
)



    }
}