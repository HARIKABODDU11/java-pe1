package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {
    Iteration itr;
    @Before
    public void setUp() {
        System.out.println("Before");
        itr = new Iteration();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        itr = null;
    }

    @Test
    public void givenNumberShouldReturnIteration() {
        String result = itr.loop(5);
        assertEquals("122333444455555", result);
    }
    @Test
    public void givenNumberShouldReturnError() {
        String result = itr.loop(0);
        assertEquals("error", result);
    }

}