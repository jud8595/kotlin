package com.ggl.cart.domain

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GreetingServiceTest {

    @Test
    fun when_Greet_should_return_helloTest() {
        // given
        val adapter = mockk<IGreetingAdapter>()
        every { adapter.greet() } returns "Test"
        val greetingService = GreetingService(adapter)

        // when
        val actual = greetingService.greet()

        // then
        Assertions.assertEquals("Hello Test", actual)
    }
}