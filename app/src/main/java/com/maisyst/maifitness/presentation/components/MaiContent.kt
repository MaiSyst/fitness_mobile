package com.maisyst.maifitness.presentation.components
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable

@Composable
fun MaiContent(paddingValues: PaddingValues,content:@Composable ()->Unit) {
    content()
}