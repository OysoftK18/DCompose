package com.example.dc_ran.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun inputTextField(
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
    valueState: MutableState<String>,
    isSingleLIne: Boolean,
    idLabel: String,
    imeAction: ImeAction = ImeAction.Next,
    keyboardType: KeyboardType = KeyboardType.Number,
    onAction: KeyboardActions = KeyboardActions.Default,
    enabled: Boolean){

    OutlinedTextField(
        modifier = modifier,
        value = valueState.value,
        onValueChange = {valueState.value = it},
        singleLine = isSingleLIne,
        label = { Text(text = idLabel)},
        enabled = enabled,
        keyboardActions = onAction,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType, imeAction = imeAction),
        shape = RoundedCornerShape(10.dp)
        )
}