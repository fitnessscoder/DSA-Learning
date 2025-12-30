package recursion;

import java.util.Scanner;

public class PrintReverseBacktrack {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        printTill1Backtracking(1, number);
        sc.close(); // Close

    }

    private static void printTill1Backtracking(int i, int number) {
        if(i>number) return;
        printTill1Backtracking(i+1,number);
        System.out.println(i);
    }
}
