package hasing;

import java.util.Scanner;

public class SearchNumInArray {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter size of array of your choice: ");
        int number = sc.nextInt(); // Read integer input
        int [] arr = new int[number];
        for(int i=0; i<arr.length; i++) {
            arr[i]  = sc.nextInt();
        }

        System.out.println("Entered array for Search ");
        for(int a : arr) {
            System.out.print(a +" ");
        }
        System.out.println();

        //PreComputation
        int[] hash = new int [13];
        for (int i=0; i<arr.length; i++) {
            hash[arr[i]]++;
        }

        int searchSeq = sc.nextInt();
        while (searchSeq>0) {
            System.out.println("Enter a num to get its occurance :");
            int searchNum=sc.nextInt();
            System.out.println("The enterned Num :"+searchNum+" occured for :" +hash[searchNum] +" times");
            searchSeq--;
        }

    }
}
