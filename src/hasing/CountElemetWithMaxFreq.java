package hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountElemetWithMaxFreq {
    public static void main(String[] args) {
        System.out.println("Main method");

        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter size of array of your choice: ");
        int number = sc.nextInt(); // Read integer input
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array for Search ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        int totalMaxFrequncey = maxFrequencyElements(arr);
        System.out.println("Total Max Frequency is :"+totalMaxFrequncey);
    }

    private static int maxFrequencyElements(int[] arr) {

        int maxfreq=Integer.MIN_VALUE;
        int prevMaxFreq=Integer.MIN_VALUE;

        Map<Integer, Integer> maxFreqMap=new HashMap<>();

        //PreCompute
        for(int element : arr) {
            if(maxFreqMap.containsKey(element)) {
                maxFreqMap.put(element,maxFreqMap.get(element)+1);
            } else {
                maxFreqMap.put(element,1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: maxFreqMap.entrySet()) {
            if(prevMaxFreq==entry.getValue()) {
                maxfreq=maxfreq+entry.getValue();
            } else if (prevMaxFreq<entry.getValue()) {
                maxfreq=entry.getValue();
                prevMaxFreq=maxfreq;
            }
        }

        return maxfreq;
    }
}
