package com.ggl.cart.infrastructure.resource

import com.ggl.cart.domain.IGreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingResource {

    @Autowired
    lateinit var greetingService: IGreetingService

    @GetMapping("/greeting/http")
    fun greetingHttp() =
            greetingService.greet();

}