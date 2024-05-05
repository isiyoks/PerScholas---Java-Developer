package SBA.SBA1;

import java.util.Scanner;

/*
Create a  method to divide the digits of a given string.
Strings length is between 2 - 100;

EX String s = 824
Answer = 1;

8/2 = 4
4/2 =1
 */
public class Division {

    public static int divideDigits(){
        Scanner scan = new Scanner(System.in);
        String number;
       do {
           System.out.println("Write a number that its length is between 2 - 100");
           number = scan.nextLine();
       }while(number.length()<2 || number.length()>100);

        int result = Character.getNumericValue(number.charAt(0));   // 8/2=4

        for (int i = 1; i < number.length(); i++) {
            result /= Character.getNumericValue(number.charAt(i)); //  4/2
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("divideDigits() = " + divideDigits());
    }

}
