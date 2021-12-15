package io.sample.service.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Sample {

    @GetMapping("/hello")
    fun testGetMapping(): String {
        return "Hello World"
    }
}
