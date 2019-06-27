package com.stackroute.junitdemo;

public class StringRev {
    public  static String RevCheck(String word)
    {

         String str = "";
        if (word == null) {
            str = "Error";
        }
        else if(word=="")
            str="Empty String";
         int length =word.length();
        for(int i =length-1;i>= 0;i--)
              str = str+word.charAt(i);
        return  str;
    }

}
