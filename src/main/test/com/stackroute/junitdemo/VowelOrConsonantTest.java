package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {
    VowelOrConsonant vol;
    @Before
    public void setUp() {
        System.out.println("Before");
        vol = new VowelOrConsonant();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        vol = null;
    }

    @Test
    public void givenStringShouldReturnVowel() {
        String result = vol.checkVowel("a");
        assertEquals("vowel", result);
    }
    @Test
    public void givenStringShouldReturnConsonant() {
        String result = vol.checkVowel("p");
        assertEquals("Consonant", result);
    }
    @Test
    public void givenStringShouldReturnVowelOrConsonant() {
        String result = vol.checkVowel("ap");
        assertEquals("vowelConsonant", result);
    }
    @Test
    public void givenNumberShouldReturnNull() {
        String result = vol.checkVowel("@");
        assertEquals("error",result);
    }
}