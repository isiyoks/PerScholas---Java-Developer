package HackerRank.Exceptions;

import java.util.Scanner;
//https://www.hackerrank.com/challenges/java-exception-handling/problem
class JavaExceptionHandling {
    /*
     * Create the method long power(int, int) here.
     */
    long power(int n, int p) throws Exception{

        long result =0 ;
        if (n == 0 || p == 0){
            throw new Exception("n and p should not be zero.");
        }
        if(n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        result = (long) Math.pow(n,p);
        return result;
    }
}


 class Solution {
    public static final JavaExceptionHandling my_calculator = new JavaExceptionHandling();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
