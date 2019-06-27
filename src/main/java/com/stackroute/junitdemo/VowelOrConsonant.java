package com.stackroute.junitdemo;

public class VowelOrConsonant {
    public String checkVowel(String c) {
        String result="";
        int i;
        for (i = 0; i < c.length(); i++) {
            if (!((c.charAt(i) >= 'a' && c.charAt(i) <= 'z') || (c.charAt(i) >= 'A' && c.charAt(i) <= 'Z'))) {
                return "error";
            } else {
                switch (c.charAt(i)) {
                    case 'a':
                        result += "vowel";
                        break;
                    case 'e':
                        result +="vowel";
                        break;
                    case 'i':
                        result +="vowel";
                        break;
                    case 'o':
                        result +="vowel";
                        break;
                    case 'u':
                        result +="vowel";
                        break;
                    case 'A':
                        result +="vowel";
                        break;
                    case 'E':
                        result +="vowel";
                        break;
                    case 'I':
                        result+= "vowel";
                        break;
                    case 'O':
                        result+="vowel";
                        break;
                    case 'U':
                        result+="vowel";
                        break;
                    default:
                        result+="Consonant";
                        break;
                }
            }
        }return result;
    }
}
