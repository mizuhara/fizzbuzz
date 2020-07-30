package com.example.fizzbuzz.api

import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid
import javax.validation.constraints.Min

@RestController
@Validated
class FizzBuzzApi {
    @GetMapping("/fizzbuzz")
    fun toWord(@Valid @Min(1) @RequestParam value: Int): String = toWordImpl(value)
}