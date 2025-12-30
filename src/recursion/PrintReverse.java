package recursion;

import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        printTill1(number);
        sc.close(); // Close

    }

    private static void printTill1(int i) {
        if(i<1) return;
        System.out.println(i);
        printTill1(i-1);
    }
}
