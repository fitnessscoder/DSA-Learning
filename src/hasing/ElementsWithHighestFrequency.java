package hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementsWithHighestFrequency {
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

        //PreComputing
        Map<Integer, Integer> preCompute=new HashMap<>();

        for(int element : arr) {
            if(preCompute.containsKey(element)) {
                preCompute.put(element, preCompute.get(element)+1);
            } else
                preCompute.put(element,1);
        }

        int highOccKey=0;
        int lowOccKey=0;
        int highestOccurance=Integer.MIN_VALUE;
        int lowestOccurance =Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> entry : preCompute.entrySet()) {
            if(entry.getValue()>highestOccurance) {
                highestOccurance=entry.getValue();
                highOccKey=entry.getKey();
            }

            if (entry.getValue()<lowestOccurance){
                lowestOccurance=entry.getValue();
                lowOccKey=entry.getKey();
            }
        }

        System.out.println("Hightest Occurance Key is "+highOccKey+" with "+highestOccurance+ " occurances");

        System.out.println("Lowest Occurance Key is "+lowOccKey+" with "+lowestOccurance+ " occurances");
    }
}
