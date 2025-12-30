package recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        sumOfFirstNParameterized(number,0);
        System.out.println("Using Functional Way " +fuctionalWay(number));
        sc.close(); // Close

    }

    private static int fuctionalWay(int number) {
        if(number==0) return 0;

        return number+fuctionalWay(number-1);
    }

    private static void sumOfFirstNParameterized(int number, int sum) {
        if(number==0) {
            System.out.println("Sum Of first N using Parameterized :"+sum);
            return;
        }
        sumOfFirstNParameterized(number-1, sum+number);
    }
}
