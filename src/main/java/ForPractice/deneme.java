package ForPractice;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Character.MAX_VALUE;
import static java.lang.Character.MIN_VALUE;


public class deneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer (X): ");
            int x = scanner.nextInt();

            System.out.print("Enter the second integer (Y): ");
            int y = scanner.nextInt();

            // Check if x and y are within the 32-bit signed integer range
            if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE ||
                    y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
                throw new InputMismatchException("Value out of range. Please enter 32-bit signed integers.");
            }

            if (y == 0) {
                throw new ArithmeticException("java.lang.ArithmeticException: / by zero");
            }

            int result = x / y;
            System.out.println("Result (X/Y): " + result);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}