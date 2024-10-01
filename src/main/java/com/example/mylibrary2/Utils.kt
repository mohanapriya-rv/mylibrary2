package com.example.mylibrary2

object Utils {
    fun capitalize(input: String): String {
        return input.replaceFirstChar { it.uppercase() }
    }
}