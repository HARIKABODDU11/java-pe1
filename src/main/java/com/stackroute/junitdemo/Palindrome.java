package com.stackroute.junitdemo;

public class Palindrome{

    public String CheckPalindrome(int num)
    {
        int sum = 0, rem, rev = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            if (rem % 2 == 0)
                sum = sum + rem;
            num = num / 10;
        }
        if (rev == temp) {
            if (sum > 25) {
                return temp+"is palindrome and the sum of even numbers is greater than 25";
            }
            else
            {
                return temp+"is palindrome and the sum of even numbers is less than 25";
            }

        }
        else
        {
            return "Not a palindrome";
        }
    }
}



