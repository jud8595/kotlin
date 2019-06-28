package com.ggl.cart.domain

class GreetingService(private val greetingAdapter: IGreetingAdapter): IGreetingService {

    override fun greet(): String {
        return "Hello " + greetingAdapter.greet()
    }
}
