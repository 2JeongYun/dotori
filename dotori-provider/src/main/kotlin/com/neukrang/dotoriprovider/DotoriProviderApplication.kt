package com.neukrang.dotoriprovider

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DotoriProviderApplication

inline fun <reified T> logger(from: T): Logger {
	return LoggerFactory.getLogger(T::class.java)
}

fun main(args: Array<String>) {
	runApplication<DotoriProviderApplication>(*args)
}
