package com.stackroute.junitdemo;

public class Sum {

    public   String total(String number)//Method to add numbers in array
    {
        int sum=0;

        String string="";
        String[] array=number.split(" ");
        int arr[] = new int[array.length];
        try{
            for(int i=0;i<array.length;i++) {
                arr[i] = Integer.parseInt(array[i]);

            }
        }
        catch(Exception exception){
            string="Error";
            return string;
        }
        for(int i=0;i<array.length;i++) {
            sum=arr[i]+sum;

        }
        string=""+sum;
        return (string);
    }

}
