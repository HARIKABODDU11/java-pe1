package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {
    Character c;
    @Before
    public void setUp() {
        System.out.println("Before");
        c = new Character();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        c = null;
    }

    @Test
    public void givenNumberShouldReturnSmallLetter() {
        String result = c.display('a');
        assertEquals("Small Letter", result);
    }
    @Test
    public void givenNumberShouldReturnCapitalLetter() {
        String result = c.display('A');
        assertEquals("Capital Letter", result);
    }
    @Test
    public void givenNumberShouldReturnSpecialCharacter() {
        String result = c.display('#');
        assertEquals("Special Character", result);
    }
    @Test
    public void givenNumberShouldReturnDigit() {
        String result = c.display('2');
        assertEquals("Digit", result);
    }
    @Test
    public void givenNumberShouldReturnNull() {
        String result = c.display(' ');
        assertEquals("Null", result);
    }
}