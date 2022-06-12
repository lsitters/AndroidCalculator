package com.example.calculator

import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1.0f)
                    .clip(RoundedCornerShape(24.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant),
                contentAlignment = Alignment.BottomEnd
            ) {
                EquationText(state)
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.tertiary)
                        .aspectRatio(2f)
                        .weight(2f),
                    symbolColor = MaterialTheme.colorScheme.onTertiary,
                    onClick = {
                        onAction(CalculatorAction.Clear)
                    }
                )

                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSecondary,
                    onClick = {
                        onAction(CalculatorAction.Delete)
                    }
                )

                CalculatorButton(
                    symbol = "÷",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSecondary,
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Divide))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "×",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSecondary,
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSecondary,
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Subtract))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.secondary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSecondary,
                    onClick = {
                        onAction(CalculatorAction.Operation(CalculatorOperation.Add))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(2f)
                        .weight(2f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Number(0))
                    }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    onClick = {
                        onAction(CalculatorAction.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .aspectRatio(1f)
                        .weight(1f),
                    symbolColor = MaterialTheme.colorScheme.onPrimary,
                    onClick = {
                        onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun EquationText(state: CalculatorState) {
    AnimatedContent(
        targetState = state.num1 + state.operation?.symbol.orEmpty() + state.num2,
        transitionSpec = {
            // Compare the incoming number with the previous number.
            if (targetState != initialState) {
                // If the target number is larger, it slides up and fades in
                // while the initial (smaller) number slides up and fades out.
                slideInVertically { height -> height } + fadeIn() with
                        slideOutVertically { height -> -height } + fadeOut()
            } else {
                // If the target number is smaller, it slides down and fades in
                // while the initial number slides down and fades out.
                slideInHorizontally { height -> -height } + fadeIn() with
                        slideOutHorizontally { height -> height } + fadeOut()
            }.using(
                // Disable clipping since the faded slide-in/out should
                // be displayed out of bounds.
                SizeTransform(clip = false)
            )
        }
    ) { targetCount ->
        Text(
            text = targetCount,
            textAlign = TextAlign.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            fontWeight = FontWeight.Light,
            fontSize = 80.sp,
            lineHeight = 80.sp,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            maxLines = 2
        )
    }
}


