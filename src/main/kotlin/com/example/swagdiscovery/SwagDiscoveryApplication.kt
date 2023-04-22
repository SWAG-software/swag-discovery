package com.example.swagdiscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SwagDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<SwagDiscoveryApplication>(*args)
}
