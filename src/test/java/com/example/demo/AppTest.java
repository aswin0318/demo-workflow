package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void greetReturnsExpectedMessage() {
        assertEquals("Hello, World!", App.greet("World"));
    }
}
