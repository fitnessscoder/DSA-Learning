import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter number of your choice: ");
        int number = sc.nextInt(); // Read integer input

        System.out.println("Digits to be reversed from : " +number);
        checkIfPalindrome(number);
        sc.close(); // Close
    }

    private static void checkIfPalindrome(int number) {
        int duplicate = number;
        int reverseNum=0;
        while (number>0) {
            int lastDigit=number%10;
            reverseNum = (reverseNum*10) +lastDigit;
            number=number/10;
        }
        if(reverseNum==duplicate) {
            System.out.println("The number "+duplicate+ " is a Palindrome");
        } else {
            System.out.println("The number "+duplicate+ " is not a Palindrome because reverse is "+reverseNum + " which is not same");
        }
    }
}
