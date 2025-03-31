package com.example.complaindesk.presentation.ui.appBar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// ✅ Home Page Content
@Composable
fun HomeScreenContent() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Welcome to the Home Page!", fontSize = 22.sp)
    }
}

// ✅ Feedback Page Content
@Composable
fun FeedbackScreenContent() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Feedback Page - Share your thoughts!", fontSize = 22.sp)
    }
}

// ✅ Developers Page Content
@Composable
fun DeveloperScreenContent() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Meet the Developers!", fontSize = 22.sp)
    }
}
