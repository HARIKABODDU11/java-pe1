package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRevTest {
    StringRev rev;

    @Before
    public void setUp() {
        System.out.println("Before");
        rev = new StringRev();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        rev = null;
    }
    @Test
    public void givenNumberShouldReturnReverse() {
        String result = rev.RevCheck("null");
        assertEquals("error",result);
    }

}