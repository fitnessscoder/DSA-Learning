package basicMaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Prime Number to be checked from : " +number);
        printAllFactors(number);
        System.out.println();
        printFactorsUsingSq(number);
        sc.close(); // Close
    }

    private static void printFactorsUsingSq(int number) {
        int count=0;
        for(int i=1; i*i<=number; i++) {
            if(number%i==0) {
                count++;

                if((number/i)!=i) {
                    count++;
                }
            }
        }

        if(count==2) {
            System.out.println("In sq Given number "+number+" is a Prime Number");
        } else {
            System.out.println("In sq Its not a prime number");
        }
    }

    private static void printAllFactors(int number) {
        int count=0;
        for(int i=1; i<=number; i++) {
            if(number%i==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("Given number "+number+" is a Prime Number");
        } else {
            System.out.println("Its not a prime number");
        }
    }
}
