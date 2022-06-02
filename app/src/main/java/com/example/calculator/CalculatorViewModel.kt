package com.example.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    // private set can't change from outside but can access and read it
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction) {
        when(action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
        }
    }

    private fun performDeletion() {
        when {
            state.num2.isNotBlank() -> state = state.copy(num2 = state.num2.dropLast(1))
            state.operation != null -> state = state.copy(operation = null)
            state.num1.isNotBlank() -> state = state.copy(num1 = state.num1.dropLast(1))
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if (state.num1.isNotBlank()) {
            // copy state, apply changed values, reassign to state, no need to make single field mutable
            state = state.copy(operation = operation)
        }
    }

    private fun enterDecimal() {
        if (state.operation == null && !state.num1.contains('.') && state.num1.isNotBlank()) {
            state = state.copy(num1 = state.num1 + '.')
            return
        }
        if (!state.num2.contains('.') && state.num2.isNotBlank()) {
            state = state.copy(num1 = state.num2 + '.')
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.num1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(num1 = state.num1 + number)
            return
        }

        if(state.num2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(num2 = state.num2 + number)
        return
    }

    private fun performCalculation() {
        val num1 = state.num1.toDoubleOrNull()
        val num2 = state.num2.toDoubleOrNull()

        if(num1 != null && num2 != null) {
            val result = when(state.operation) {
                is CalculatorOperation.Add -> num1 + num2
                is CalculatorOperation.Subtract -> num1 - num2
                is CalculatorOperation.Divide -> num1 / num2
                is CalculatorOperation.Multiply -> num1 * num2
                null -> return
            }
            state = state.copy(
                num1 = result.toString().take(15),
                num2 = "",
                operation = null
            )
        }
    }

    companion object {
        private const val MAX_NUM_LENGTH = 8
    }
}


