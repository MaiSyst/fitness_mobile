package com.maisyst.maifitness.presentation.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.maisyst.maifitness.presentation.components.MaiBottomBar
import com.maisyst.maifitness.presentation.components.MaiContent
import com.maisyst.maifitness.presentation.components.MaiTopBar

@Composable
fun Home() {
    Scaffold(
        topBar = { MaiTopBar()},
        bottomBar = { MaiBottomBar()},
        content = {
            MaiContent(paddingValues = it,content={})
        }
    )
}