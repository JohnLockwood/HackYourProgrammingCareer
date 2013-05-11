package com.particlewave.HelloJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.junit.Test;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestHello {

    @Test
    public void testHello() {
        String expected = "Hello, JUnit!";
        String hello = "Hello, JUnit!";
        // This is a bug:
        // String hello= "Goodbye, cruel bug!";
        assertEquals(hello, expected);
    }
}
