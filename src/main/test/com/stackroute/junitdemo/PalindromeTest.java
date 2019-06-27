package com.stackroute.junitdemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pal;

    @Before
    public void setUp() {
        System.out.println("Before");
        pal = new Palindrome();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        pal = null;
    }

    @Test
    public void givenNumberShouldReturnPalindromeLesser() {
        String result = pal.CheckPalindrome(932239);
        assertEquals("932239is palindrome and the sum of even numbers is less than 25", result);
    }
    @Test
    public void givenNumberShouldReturnPalindromeGreater() {
        String result = pal.CheckPalindrome(2468642);
        assertEquals("2468642is palindrome and the sum of even numbers is greater than 25", result);
    }
    @Test
    public void givenNumberShouldReturnNotPalindrome() {
        String result = pal.CheckPalindrome(24245);
        assertEquals("Not a palindrome", result);
    }

}