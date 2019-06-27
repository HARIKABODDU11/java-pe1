package com.stackroute.junitdemo;

public class EvenOrOdd {

    public  String isOdd(int num)
    {
        String result=null;
        if(num%2==0 && (num>20&&num<30)) {
            result = "Jerry";
        }
        else if(num%2!=0 && (num>20&&num<30)){
            result="Tom";
        }
        return result;
    }

}
