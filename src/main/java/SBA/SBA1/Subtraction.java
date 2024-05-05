package SBA.SBA1;

import java.util.Scanner;

/*
Create a  method to subtract the digits of a given string.

Strings length is between 2 - 100;

EX String s = 824   ((digit1 -digit2)- digit3)-digit4
Answer = 2;
8-2 = 6
6-4 =2
 */
public class Subtraction {

    public static int subtractDigits() {
        Scanner scan = new Scanner(System.in);
        String number;

        do {
            System.out.println("Write a number that its length is between 2 - 100");
            number = scan.nextLine();
        }while(number.length()<2 || number.length()>100);


        int result = Character.getNumericValue(number.charAt(0));

        for (int i = 1; i < number.length(); i++) {
            result -= Character.getNumericValue(number.charAt(i));   //8-2=6    6-4=2
        }
        return result;
    }

    public static void main(String[] args) {
        int answer = subtractDigits();
        System.out.println(answer);
    }
}
