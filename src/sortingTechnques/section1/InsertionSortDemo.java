package sortingTechnques.section1;

import java.util.Scanner;

public class InsertionSortDemo {
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


        sortByInsertionSort(arr);

        System.out.println("Sorted Array");

        for(int elements : arr) {
            System.out.print(elements+" ");
        }
    }

    private static void sortByInsertionSort(int[] arr) {
        for(int i=0; i<=arr.length-1; i++) {
            int j=i;
            while (j>0) {
                if(arr[j-1]>arr[j]) {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                j--;
            }
        }
    }
}
