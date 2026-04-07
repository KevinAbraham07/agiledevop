package com.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testDuplicateUser() {
        App.register("Kevin", "a@mail.com");
        assertEquals("Duplicate user", App.register("Kevin", "a@mail.com"));
    }

    @Test
    void testInvalidInput() {
        assertEquals("Invalid input", App.register(null, null));
    }
}