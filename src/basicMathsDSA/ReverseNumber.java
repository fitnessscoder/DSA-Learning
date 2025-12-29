package basicMathsDSA;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Digits to be reversed from : " +number);
        reverseNumber(number);
        sc.close(); // Close
    }

    private static void reverseNumber(int number) {
        int carry=0;
        while (number>0) {
            int lastDigit = number%10;
            carry = (carry*10) +lastDigit;
            number=number/10;
        }

        System.out.println("Reversed number is :"+carry);
    }
}
