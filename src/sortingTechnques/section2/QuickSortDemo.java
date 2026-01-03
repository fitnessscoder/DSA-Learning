package sortingTechnques.section2;

import java.util.Scanner;

public class QuickSortDemo {
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

        sortByQuickSort(arr);

        System.out.println("Sorted Array");
        for(int element : arr)  {
            System.out.print(element +" ");
        }
    }

    private static void sortByQuickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pIndex=findPartition(arr,low,high);
            quickSort(arr,low,pIndex-1);
            quickSort(arr,pIndex+1,high);
        }
    }

    private static int findPartition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;

        while (i<j) {
            while (arr[i]<=pivot && i<high) {
                i++;
            }

            while (arr[j]>pivot && j>=low) {
                j--;
            }

            if(i<j) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] =temp;
            }
        }

        //place pivot at its correct position
        int temp=arr[j];
        arr[j] = pivot;
        arr[low] = temp;

        return j;
    }
}
