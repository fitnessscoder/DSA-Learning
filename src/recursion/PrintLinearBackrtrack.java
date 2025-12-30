package recursion;

import java.util.Scanner;

public class PrintLinearBackrtrack {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        printTillNByBacktracking(number);
        sc.close(); // Close

    }

    private static void printTillNByBacktracking(int i) {
        if(i<1) return;
        printTillNByBacktracking(i-1);
        System.out.println(i);
    }
}
