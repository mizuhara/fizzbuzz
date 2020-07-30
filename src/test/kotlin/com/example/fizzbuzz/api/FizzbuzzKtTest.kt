package com.example.fizzbuzz.api

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

internal class FizzbuzzKtTest {

    @ParameterizedTest
    @MethodSource("dataProvider")
    fun toWordImpl(src: Int, expected: String) = assertEquals(expected, toWordImpl(src))

    companion object {
        @Suppress("unused")
        @JvmStatic
        fun dataProvider(): Stream<Arguments> = Stream.of(
            Arguments.arguments(1, "1"),
            Arguments.arguments(2, "2"),
            Arguments.arguments(3, "fizz"),
            Arguments.arguments(4, "4"),
            Arguments.arguments(5, "buzz"),
            Arguments.arguments(15, "fizzbuzz")
        )
    }
}