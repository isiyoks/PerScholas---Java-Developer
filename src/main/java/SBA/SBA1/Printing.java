package SBA.SBA1;

import java.util.Scanner;

/*
Using the following classes ArraysLinks to an external site. ,
StringLinks to an external site.
and CharacterLinks to an external site. .
Create  3 methods that will print each individual  digit of a string.
You will use each class to create one method.

Strings length is between 2 - 100;

Ex String s = 597;
Print : Number 1 is 5
Print : Number 2 is 9
Print : Number 3 is 7
 */
public class Printing {
public static void printDigitsWithString(String s) {
    for (int i = 0; i < s.length(); i++) {
        char digit = s.charAt(i);
        System.out.println("Number " + (i + 1) + " is " + digit);
    }
}
    public static void printDigitsWithCharacter (String s){
        for (int i = 0; i < s.length(); i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            System.out.println("Number " + (i + 1) + " is " + digit);
        }
    }

    public static void printDigitsWithArrays (String s){
        for (int i = 0; i < s.length(); i++) {
            char [] digits = s.toCharArray();
            System.out.println("Number " + (i + 1) + " is " + digits[i]);
        }
    }

    public static void main(String[] args) {
        String s = "597";
        printDigitsWithString(s);
        System.out.println(" --------------- ");
        printDigitsWithCharacter(s);
        System.out.println(" --------------- ");
        printDigitsWithArrays(s);
    }
}