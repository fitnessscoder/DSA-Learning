package sortingTechnques.section2;


import java.util.Scanner;

public class MergeSortDemo {
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

        sortByMergeSort(arr);

        System.out.println("Sorted Array");
        for(int element : arr)  {
            System.out.print(element +" ");
        }
    }

    private static void sortByMergeSort(int[] arr) {
        int low=0;
        int high=arr.length-1;
        mergeSort(arr, low, high);
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid=low+(high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergeSortedArrays(arr,low,mid,high);
    }

    private static void mergeSortedArrays(int[] arr, int low, int mid, int high) {
        int[] temp=new int[high-low+1];
        int tempCounter=0;
        int left= low;
        int right=mid+1;

        while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]) {
                temp[tempCounter]=arr[left];
                tempCounter++;
                left++;
            } else {
                temp[tempCounter]=arr[right];
                tempCounter++;
                right++;
            }
        }

        while(left<=mid) {
            temp[tempCounter]=arr[left];
            tempCounter++;
            left++;
        }

        while (right<=high) {
            temp[tempCounter]=arr[right];
            tempCounter++;
            right++;
        }

        for(int i=0; i<temp.length; i++) {
            arr[low+i]=temp[i];
        }
    }
}
