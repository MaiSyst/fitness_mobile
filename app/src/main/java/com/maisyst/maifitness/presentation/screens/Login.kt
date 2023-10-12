package com.maisyst.maifitness.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maisyst.maifitness.presentation.components.MaiBottomBar
import com.maisyst.maifitness.presentation.components.MaiContent
import com.maisyst.maifitness.presentation.components.MaiTextField
import com.maisyst.maifitness.presentation.components.MaiTopBar

@Composable
fun Login() {
    Scaffold(
        containerColor = Color.Black,
        topBar = { MaiTopBar() },
        bottomBar = { MaiBottomBar() },
        content = {
            MaiContent(paddingValues = it, content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.radialGradient(
                                Pair(0.05f, Color(0xFF170131)), Pair(1f, Color(0xFF0D021B)),

                                )
                        )
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxSize()
                    ) {
                        Text(text = "MF", color = Color.White)
                    }
                    Box(Modifier
                                .weight(2f).padding(horizontal = 50.dp)) {
                        LazyColumn(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier
                                .fillMaxSize()


                        ) {
                            item {
                                MaiTextField(
                                    placeholder = "Nom d'utilisateur",
                                    value = "",
                                    icon = null,
                                    modifier = Modifier.fillMaxWidth(),
                                    onChange = { })

                            }
                            item {
                                MaiTextField(
                                    placeholder = "Mot de passe",
                                    value = "",
                                    icon = null,
                                    modifier = Modifier.fillMaxWidth(),
                                    onChange = { })

                            }
                            item { Spacer(modifier = Modifier.height(50.dp)) }
                            item {
                                Button(
                                    modifier = Modifier.fillMaxWidth(),
                                    onClick = { /*TODO*/ },
                                ) {
                                    Text(text = "Se connecter")
                                }
                            }
                        }
                    }
                }

            })
        }
    )
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LoginPreview() {
    Login()
}