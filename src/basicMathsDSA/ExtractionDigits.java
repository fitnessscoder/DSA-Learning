package basicMathsDSA;

import java.util.Scanner;

public class ExtractionDigits {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Digits to be extracted from : " +number);
        extractDigits(number);
        sc.close(); // Close
    }

    private static void extractDigits(int number) {
        while (number>0) {
            int lastDigit = number%10;
            System.out.println(lastDigit);
            number=number/10;
        }
    }
}
