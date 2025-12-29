package basicMathsDSA;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Digits to be armstronged from : " +number);
        checkArmStrongNumber(number);
        sc.close(); // Close
    }

    private static void checkArmStrongNumber(int number) {
        int sum=0;
        int duplicate=number;
        while(number>0) {
            int lastDigit=number%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            number=number/10;
        }
        if(duplicate==sum) {
            System.out.println("The number "+duplicate +" is an Armstrong Number");
        } else {
            System.out.println("The number "+duplicate +" is NOT an Armstrong Number");
        }
    }
}
