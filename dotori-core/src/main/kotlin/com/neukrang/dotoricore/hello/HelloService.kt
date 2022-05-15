package com.neukrang.dotoricore.hello

import org.springframework.stereotype.Service

@Service
class HelloService(
    val name: String = "JY"
) {

    fun getHello(): String {
        return "Hello, $name"
    }
}