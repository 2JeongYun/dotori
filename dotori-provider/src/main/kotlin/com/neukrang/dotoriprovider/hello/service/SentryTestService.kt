package com.neukrang.dotoriprovider.hello.service

import com.neukrang.dotoriprovider.logger
import org.springframework.stereotype.Service

@Service
class SentryTestService {

    val logger = logger(this)

    fun invokeError(): String {
        logger.info("INFO invokeError")
        logger.warn("WARN invokeError")
        logger.error("ERROR invokeError")
        throw RuntimeException("Sentry Test Error!")
    }

    fun catchException(): String {
        try {
            throw RuntimeException("Caught Exception")
        } catch (e: RuntimeException) {
            return "Exception was caught"
        }
    }

    fun justLog(type: String): String {
        when (type) {
            "info" -> logger.info("INFO justLog")
            "warn" -> logger.warn("WARN justLog")
            "error" -> logger.error("ERROR justLog")
        }
        return "just $type log"
    }
}