package com.stackroute.junitdemo;

import java.util.Objects;

public class StringRepeat
{
    public static String repeat(String word, int n)    //This  method  reverses the string
    {
        int l;
        String str = "";
        if (word != null) {
            l = word.length();


            if (word.equals("")) {
                str = "Error";

            } else if (l > 0) {
                String s = word.substring(l - n, l);
                for (int i = 0; i < n; i++)
                    str = str + s;
                str = word + str;

            }
        }
        if (word == null) {
            str = "Error";

        }
        return str;
    }
}

