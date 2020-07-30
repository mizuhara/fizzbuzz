package com.example.fizzbuzz.api

fun toWordImpl(n: Int): String =
    buildString {
        if (n % 3 == 0) append("fizz")
        if (n % 5 == 0) append("buzz")
        if (isEmpty()) append(n)
    }
