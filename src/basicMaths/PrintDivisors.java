package basicMaths;

import java.util.Scanner;

public class PrintDivisors {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Divisors to be printed from : " +number);
        printAllDivisors(number);
        System.out.println();
        printUsingSqMethod(number);
        sc.close(); // Close
    }

    private static void printUsingSqMethod(int number) {
        for(int i=1; i*i<=number; i++) {
          //  System.out.println("came here");
            if(number%i==0) {
                System.out.print(i+" ");
                if((number/i)!=i) {
                    System.out.println("came here during :"+ i +" and " +(number/i));
                    System.out.print((number/i)+" ");
                }
            }
        }
    }

    private static void printAllDivisors(int number) {
        for (int i=1; i<=number; i++) {
            if(number%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
