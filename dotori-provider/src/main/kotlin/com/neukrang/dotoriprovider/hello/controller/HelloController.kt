package com.neukrang.dotoriprovider.hello.controller

import com.neukrang.dotoriprovider.hello.service.SentryTestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloController(
    val sentryTestService: SentryTestService
) {
    @GetMapping
    fun hello(): String {
        return "Hello"
    }

    @GetMapping("/hello/invoke-error")
    fun invokeError(): String {
        return sentryTestService.invokeError()
    }
}