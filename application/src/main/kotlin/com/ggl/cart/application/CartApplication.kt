package com.ggl.cart.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.ggl.cart.application", "com.ggl.cart.infrastructure")
class CartApplication

fun main(args: Array<String>) {
	runApplication<CartApplication>(*args)
}
