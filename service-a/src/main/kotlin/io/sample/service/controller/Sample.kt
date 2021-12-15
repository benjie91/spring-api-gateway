package io.sample.service.controller

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class Sample(
) {
    @GetMapping("/hello")
    fun testGetMapping(
        @RequestHeader headers: Map<String, String>,
        serverHttpRequest: ServerHttpRequest
    ): String {
        println(serverHttpRequest.remoteAddress)
        println(headers)
        return "Hello World"
    }
}
