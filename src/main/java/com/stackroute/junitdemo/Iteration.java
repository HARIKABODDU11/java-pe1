package com.stackroute.junitdemo;

public class Iteration {
    public String loop(int number1) {
         String a="";
        if (number1 < 1) {
            return  "error";
        }
        else {

            for (int i = 1; i <= number1; i++) {
                for (int j = 1; j <= i; j++) {
                   a= a + i;
                }

            }
        }return a;

    }
}