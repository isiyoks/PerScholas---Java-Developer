package HackerRank.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.MAX_VALUE;
import static java.lang.Character.MIN_VALUE;
//https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
public class JavaExceptionHandlingTrCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner scan = new Scanner(System.in);

            // System.out.print("Enter the first integer (X): ");
            int x = scan.nextInt();

            // System.out.print("Enter the second integer (y): ");
            int y = scan.nextInt();

            System.out.println(x / y);


        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }


    }
}
