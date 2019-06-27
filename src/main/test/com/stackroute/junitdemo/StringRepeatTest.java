package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    public StringRepeat rep;

    @Before
    public void setUp() {
        System.out.println("Before");
        rep= new StringRepeat();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        rep = null;
    }

    @Test
    public void givenIntegerAndStringShouldReturnString() {
        //arrange

        //Act
        String result= rep.repeat("Stack",3);
        //Assert
        assertEquals("Stackackackack", result);

    }
    @Test
    public void givenStringAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= rep.repeat("",5);
        //Assert
        assertEquals("Error", result);

    }
    @Test
    public void givenNullAndIntegerShouldReturnError() {
        //arrange

        //Act
        String result= rep.repeat(null,2);
        //Assert
        assertEquals("Error", result);

    }


}