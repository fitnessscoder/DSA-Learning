package basicMaths;

import java.util.Scanner;

import static java.lang.Math.min;

public class GCDHCF {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter First number of your choice: ");
        int number1 = sc.nextInt();

        System.out.print("Enter Second number of your choice: ");
        int number2 = sc.nextInt();// Read integer input

        System.out.println("GCD Number to be checked from : " +number1 +" and "+number2);
        printhcf(number1,number2);
        System.out.println();
        printUsingEculidean(number1,number2);
        sc.close(); // Close
    }

    private static void printUsingEculidean(int number1, int number2) {
        while (number1>0 && number2>0) {
            if(number1>number2) {
                number1=number1%number2;
            } else {
                number2=number2%number1;
            }
        }

        if(number1==0) {
            System.out.println("GCD From EU is "+number2);
        } else {
            System.out.println("GCD From EU is "+number1);
        }
    }

    private static void printhcf(int number1, int number2) {
        int gcd=1;

        for(int i=1; i<=min(number1,number2); i++) {
            if(number1%i ==0 && number2%i==0) {
                gcd=i;
            }
        }

        System.out.println("GCD is "+ gcd);
    }
}
