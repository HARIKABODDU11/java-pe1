package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOrOddTest {
    EvenOrOdd pal;

    @Before
    public void setUp() {
        System.out.println("Before");
        pal = new EvenOrOdd();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        pal = null;
    }

    @Test
    public void givenNumberShouldReturnJerry() {
        String result = pal.isOdd(24);
        assertEquals("Jerry", result);
    }

    @Test
    public void givenNumberShouldReturnTom() {
        String result = pal.isOdd(25);
        assertEquals("Tom", result);
    }
    @Test
    public void givenNumberShouldReturnNull() {
        String result = pal.isOdd(15);
        assertEquals(null,result);
    }
}


