package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {
    public Sum s;

    @Before
    public void setUp() {
        System.out.println("Before");
        s = new Sum();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        s = null;
    }

    @Test
    public void givenOneStringShouldReturnSum() {
        //arrange

        //Act
        String result= s.total("12 23 4 2");

        //Assert
        assertEquals("41", result);

    }
    @Test
    public void givenOneStringShouldReturnError() {
        //arrange

        //Act
        String result= s.total("23 4 p");

        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullShouldReturnError() {
        //arrange

        //Act
        String result= s.total("null");

        //Assert
        assertEquals("Error", result);

    }

}