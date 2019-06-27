package com.stackroute.junitdemo;

public class Character {
    public String display(char character){

        if(character>=97 && character<=123){
            return "Small Letter";
        }
        else if(character>=65 && character <=96){
            return "Capital Letter";
        }
        else if(character >=48 && character <=57){
            return "Digit";
        }
        else if(character >=33 && character <=47){
            return "Special Character";
        }
        else{
            return "Null";
        }
    }
}
