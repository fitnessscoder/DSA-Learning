import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Digits to be counted from : " +number);
        countDigits(number);
        sc.close(); // Close
    }

    private static void countDigits(int number) {
        int count=0;
        while(number>0) {
            number=number/10;
            count++;
        }
        System.out.println("Total digits in given number are :" +count);
    }
}
