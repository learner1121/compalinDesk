package com.example.complaindesk.presentation.homeNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.complaindesk.R

@Composable
fun btn_Clickable(navController: NavController){
    Button(modifier = Modifier.padding(8.dp),
        onClick = { navController.navigate("Feedback") }) {
        Image(painterResource(R.drawable.basant),
            contentDescription = "Basant",
            modifier = Modifier.size(80.dp))

    }
}