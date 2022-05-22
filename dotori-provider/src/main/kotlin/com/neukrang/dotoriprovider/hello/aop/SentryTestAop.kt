package com.neukrang.dotoriprovider.hello.aop

import com.neukrang.dotoriprovider.hello.controller.SentryTestController
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice(assignableTypes = [SentryTestController::class])
class SentryTestAop {

    @ExceptionHandler(RuntimeException::class)
    fun test(): String {
        return "catch!"
    }
}