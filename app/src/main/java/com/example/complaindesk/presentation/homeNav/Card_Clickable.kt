package com.example.complaindesk.presentation.homeNav

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Clip_Clickble(navController:NavController){
    Card (
        modifier = Modifier.padding(8.dp)
            .size(80.dp),
        shape = CircleShape,
        onClick = {navController.navigate("Feedback")},
        elevation = CardDefaults.cardElevation(8.dp)
    ){
        Text("hello",
            modifier = Modifier.padding(20.dp)

        )
    }
}