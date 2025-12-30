package recursion.beginner;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter size of array of your choice: ");
        int number = sc.nextInt(); // Read integer input
        int [] arr = new int[number];
        for(int i=0; i<arr.length; i++) {
            arr[i]  = sc.nextInt();
        }

        System.out.println("Entered array for Reverse ");
        for(int a : arr) {
            System.out.print(a +" ");
        }
        System.out.println();
        reverseAnArray(arr, number, 0);
        System.out.println("After Reverse ");
        for(int a : arr) {
            System.out.print(a +" ");
        }
        sc.close(); // Close

    }

    private static void reverseAnArray(int[] arr, int number, int i) {
        if(i>=number/2) return;
        int temp = arr[i];
        arr[i]=arr[number-i-1];
        arr[number-i-1]=temp;
        reverseAnArray(arr,number,i+1);
    }

}
