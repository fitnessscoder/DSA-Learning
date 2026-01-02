package sortingTechnques.section1;

import java.util.Scanner;

public class SelectionSortDemo {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter size of array of your choice: ");
        int number = sc.nextInt(); // Read integer input
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array for Sorting ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted Array");
        for(int elements : arr) {
            System.out.print(elements +" ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i=0; i<=arr.length-1; i++) {
            int min=i;
            for(int j=i; j<= arr.length-1; j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
            }

            if(i!=min) {
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
}
