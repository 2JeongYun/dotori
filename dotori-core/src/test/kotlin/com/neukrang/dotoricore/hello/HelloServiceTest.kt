package com.neukrang.dotoricore.hello

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class HelloServiceTest(
    @Autowired val helloService: HelloService
) {

    @Test
    fun helloTest() {
        val helloMsg = helloService.getHello()

        assertThat(helloMsg).isEqualTo("Hello, JY")
    }
}