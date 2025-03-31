package com.example.complaindesk.presentation.ui.appBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch


@Composable
fun DrawerContent(navController: NavController, drawerState: DrawerState, scope: kotlinx.coroutines.CoroutineScope) {
    ModalDrawerSheet {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "ComplainDesk Menu",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = "Abc",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            NavigationDrawerItem(
                label = { Text("Home") },
                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                selected = false,
                onClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("Home") {
                        popUpTo("Home") { inclusive = true }
                    }
                }
            )
            NavigationDrawerItem(
                label = { Text("Feedback") },
                icon = { Icon(Icons.Default.ThumbUp, contentDescription = "Feedback") },
                selected = false,
                onClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("Feedback") {
                        popUpTo("Feedback") { inclusive = true }
                    }
                }
            )
            NavigationDrawerItem(
                label = { Text("Developers") },
                icon = { Icon(Icons.Default.Person, contentDescription = "Developers") },
                selected = false,
                onClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("Developers") {
                        popUpTo("Developers") { inclusive = true }
                    }
                }
            )
        }
    }
}
