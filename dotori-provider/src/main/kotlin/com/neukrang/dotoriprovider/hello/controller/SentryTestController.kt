package com.neukrang.dotoriprovider.hello.controller

import com.neukrang.dotoriprovider.hello.service.SentryTestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/invoke-error")
class SentryTestController(
    val sentryTestService: SentryTestService
) {

    @GetMapping
    fun invokeError(): String {
        return sentryTestService.invokeError()
    }

    @GetMapping("/catch")
    fun catchError(): String {
        return sentryTestService.catchException()
    }

    @GetMapping("/just-log/{type}")
    fun justLog(@PathVariable type: String): String {
        return sentryTestService.justLog(type)
    }
}