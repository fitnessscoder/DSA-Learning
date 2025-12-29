package recursion;

import java.util.Scanner;

public class RecursionPilot {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number till you need digits: ");
        int number = sc.nextInt();

        System.out.print("Entered number :" + number);

        callItself(number);
        sc.close(); // Close
    }

    private static void callItself(int number1) {
        if(number1==0) {
            return;
        }
        number1=number1-1;
        callItself(number1);
        System.out.println(number1);

        }


}
