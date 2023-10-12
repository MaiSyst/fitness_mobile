package com.maisyst.maifitness.presentation.components

import androidx.annotation.DrawableRes
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun MaiTextField(
    placeholder: String,
    value: String,
    @DrawableRes icon: Int?,
    onChange: (value: String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        modifier = modifier,
        placeholder = { Text(text = placeholder,color=Color.White.copy(alpha = 0.6f)) },
        value = value,
        colors = TextFieldDefaults.colors(
            unfocusedContainerColor = Color(0xBC281B38),
            focusedContainerColor = Color(0xBC281B38),
        ),
        prefix = {
            if (icon != null) {
                Icon(painter = painterResource(id = icon), contentDescription = null)
            }
        },
        onValueChange = onChange
    )
}