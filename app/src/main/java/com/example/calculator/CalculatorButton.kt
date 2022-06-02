package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol: String,
    symbolColor: Color = Color.White,
    modifier: Modifier,
    onClick: () -> Unit,
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable {
                onClick()
            }
            .then(modifier)

    ) {
        Text(
            text = symbol,
            color = symbolColor,
            style = MaterialTheme.typography.displaySmall
        )
    }
}

@Preview(heightDp = 50)
@Composable
fun ComposablePreview() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        CalculatorButton(
            symbol = "7",
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
                .aspectRatio(1f),
            symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
            onClick = {}
        )

        CalculatorButton(
            symbol = "8",
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
                .aspectRatio(1f),
            symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
            onClick = {}
        )

        CalculatorButton(
            symbol = "9",
            modifier = Modifier
                .background(MaterialTheme.colorScheme.surface)
                .aspectRatio(1f),
            symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
            onClick = {}
        )

        CalculatorButton(
            symbol = "×",
            modifier = Modifier
                .background(MaterialTheme.colorScheme.secondary)
                .aspectRatio(1f),
            symbolColor = MaterialTheme.colorScheme.onSecondary,
            onClick = {}
        )
    }
}