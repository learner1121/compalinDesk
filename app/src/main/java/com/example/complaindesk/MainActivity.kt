package com.example.complaindesk

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.complaindesk.presentation.HomeScreen
import com.example.complaindesk.presentation.homeNav.Clip_Clickble
import com.example.complaindesk.presentation.login.Register
import com.example.complaindesk.presentation.login.login
import com.example.complaindesk.presentation.ui.appBar.DeveloperScreenContent
import com.example.complaindesk.presentation.ui.appBar.DrawerContent
import com.example.complaindesk.presentation.ui.appBar.FeedbackScreenContent
import com.example.complaindesk.ui.theme.ComplainDeskTheme
import com.google.firebase.auth.FirebaseAuth

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            ComplainDeskTheme {
                Scaffold() {
                    MainPage()

                }
            }
        }
    }
}
@Composable
fun MainPage() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()
    lateinit var auth: FirebaseAuth
    auth = FirebaseAuth.getInstance()


    ModalNavigationDrawer(

        drawerState = drawerState,
        drawerContent = {
            DrawerContent(navController, drawerState, scope)
        }
    ) {
        Scaffold(
            topBar = { HomeScreen(drawerState, scope) },
            content = { paddingValues ->
                Column(modifier = Modifier.padding(paddingValues)
                    .fillMaxSize()
                    .background(Color(0xFF00658B))
                ) {
                    NavHost(navController, startDestination = "register") {
                        composable("Home") { Clip_Clickble(navController) }
                        composable("Feedback") { FeedbackScreenContent() }
                        composable("Developers") { DeveloperScreenContent() }
                        composable("register" ){ Register(auth,navController) }
                        composable("login") {  login(auth,navController) }

                    }

                }
            }

        )
    }
}
