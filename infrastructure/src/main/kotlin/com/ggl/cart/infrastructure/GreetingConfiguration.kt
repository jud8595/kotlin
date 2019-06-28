package com.ggl.cart.infrastructure

import com.ggl.cart.domain.GreetingService
import com.ggl.cart.domain.IGreetingService
import com.ggl.cart.infrastructure.adapter.GreetingHttp
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GreetingConfiguration {

    val greetingService: IGreetingService
        @Bean
        get() = GreetingService(GreetingHttp())
}