package com.snijsure.sonarcoverage

class MathService {
    fun multiply(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber * secondNumber
    }

    tailrec fun factorial(number: Int, accumulator: Int = 1): Int {
        return when (number) {
            1 -> accumulator
            else -> factorial(number - 1, accumulator * number)
        }
    }

    fun subtract(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber - secondNumber
    }
}