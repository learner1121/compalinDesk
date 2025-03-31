package com.example.complaindesk.presentation.homeNav

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.complaindesk.R

@Composable
fun ImageClickable(navController: NavController, size: Dp){
 Row (
     modifier = Modifier.padding(16.dp),
     horizontalArrangement = Arrangement.SpaceBetween
 ){
     Image(
         painter = painterResource(id= R.drawable.basant),
         contentDescription = "Basant",
         modifier = Modifier
             .size(size)
             .clip(CircleShape)
             .clickable { navController.navigate("Feedback") }

     )
     Spacer(modifier = Modifier.padding(8.dp))
     Image(
         painter = painterResource(id= R.drawable.basant),
         contentDescription = "Basant",
         modifier = Modifier
             .size(size)
             .clickable { navController.navigate("Home") }
     )
     Spacer(modifier = Modifier.padding(8.dp))
     Image(
         painter = painterResource(id= R.drawable.basant),
         contentDescription = "Basant",
         modifier = Modifier
             .size(size)
             .clickable { navController.navigate("Home") },


     )
 }
}