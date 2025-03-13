package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void testGreeting() {
        // This should pass if getGreeting() matches the expected text
        assertEquals("Hello from World!", App.getGreeting());
    }

    // @Test
    // public void testFail() {
    //     // This will always fail as a demonstration
    //     fail("Intentionally failing test!");
    // }
}
