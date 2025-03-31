package com.example.complaindesk.presentation.login

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth

@Composable
fun login(auth: FirebaseAuth,navController: NavController)
{
    val context = LocalContext.current
    var email by remember{ mutableStateOf("") }
    var password by remember{ mutableStateOf("") }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            Arrangement.Center

    ){
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = {Text("Email")},
            modifier = Modifier.padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = {Text("Password")},
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Button(
            onClick = {

                if(email.isNotBlank() && password.isNotBlank()  )  {
                    auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener()
                        { task ->
                            if (task.isSuccessful) {
                                Toast.makeText(context, "Login Successful ", Toast.LENGTH_LONG)
                                    .show()
                                navController.navigate("home")

                            } else {
                                Toast.makeText(
                                    context,
                                    "Can't get Access ,  ${task.exception?.message}",
                                    Toast.LENGTH_LONG
                                ).show()
                            }
                        }
                }
            }
        ) {
            Text(text = "Login")
        }

    }
}