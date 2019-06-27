package com.stackroute.junitdemo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SortingTest {

    Sorting sorting;

    @Before
    public void setUp()
    {
        System.out.println("Before");
        sorting = new Sorting();
    }

    @After
    public void tearDown()
    {
        System.out.println("After");
        sorting = null;
    }

    @Test
    public void givenNumberShouldReturnSortedNumberAndSumBelowLimit()
    {
        Sorting.Result result = sorting.sort(234534);

        assertEquals("Sorted number in non-increasing order: "
                +544332, result.sortedNumber);
        assertEquals("Sum of even numbers: "+10, result.evenSum);
        assertEquals(false,result.isSumAboveLimit);
    }

    @Test
    public void givenNumberShouldReturnSortedNumberAndSumAboveLimit()
    {
        Sorting.Result result = sorting.sort(2346158);

        assertEquals("Sorted number in non-increasing order: "
                +8654321, result.sortedNumber);
        assertEquals("Sum of even numbers: "+20, result.evenSum);
        assertEquals(true,result.isSumAboveLimit);
    }

    @Test
    public void givenZeroShouldReturnSortedNumberAndSumAboveLimit()
    {
        Sorting.Result result = sorting.sort(0);

        assertEquals("Sorted number in non-increasing order: " +0,
                result.sortedNumber);
        assertEquals("Sum of even numbers: "+0, result.evenSum);
        assertEquals(false,result.isSumAboveLimit);
    }

    @Test
    public void givenNegativeShouldReturnSortedNumberAndSumAboveLimit()
    {
        Sorting.Result result = sorting.sort(-921346);

        assertEquals("Sorted number in non-increasing order: " +
                -964321, result.sortedNumber);
        assertEquals("Sum of even numbers: "+12, result.evenSum);
        assertEquals(false,result.isSumAboveLimit);
    }




}