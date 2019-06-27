package com.stackroute.junitdemo;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessedNumberTest {

    public GuessedNumber num;

    @Before
    public void setUp() {
        System.out.println("Before");
        num = new GuessedNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        num = null;
    }

    @Test
    public void givenTwoIntegersShouldReturnMatch() {
        //arrange

        //Act
        String result= num.find(22,22);
        //Assert
        assertEquals("Number guessed matches original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsLesser() {
        //arrange

        //Act
        String result= num.find(50,84);
        //Assert
        assertEquals("Number guessed is less than original number", result);

    }
    @Test
    public void givenTwoIntegersShouldReturnNumberIsGreater() {
        //arrange

        //Act
        String result= num.find(53,48);
        //Assert
        assertEquals("Number guessed is more than original number", result);

    }



}

