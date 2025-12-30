package recursion.basics;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        printNameNTimes(1,number);
        sc.close(); // Close
    }

    private static void printNameNTimes(int i, int number) {
        if(i>number) return;
        System.out.println("Vishal");
        printNameNTimes(i+1,number);
    }
}
