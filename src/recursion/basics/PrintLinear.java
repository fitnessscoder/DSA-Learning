package recursion.basics;

import java.util.Scanner;

public class PrintLinear {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        printTillN(1,number);
        sc.close(); // Close

    }

    private static void printTillN(int i, int number) {
        if(i>number) return;
        System.out.println(i);
        printTillN(i+1, number);
    }
}
