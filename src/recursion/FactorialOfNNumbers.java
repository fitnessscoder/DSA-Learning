package recursion;

import java.util.Scanner;


public class FactorialOfNNumbers {

    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        factorialOfFirstNParameterized(number,1);
        System.out.println("Using Functional Way " +fuctionalWayFactorial(number));
        sc.close(); // Close

    }

    private static int fuctionalWayFactorial(int number) {
        if(number==0) return 1;
        return number*fuctionalWayFactorial(number-1);
    }

    private static void factorialOfFirstNParameterized(int number, int factorial) {
        if(number==0) {
            System.out.println("Factorial of first N Numbers using Parametarized :" +factorial);
            return;
        }

        factorialOfFirstNParameterized(number-1, factorial*number);
    }
}
