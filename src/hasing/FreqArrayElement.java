package hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqArrayElement {
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

        System.out.println("How many attempts do you need ? : ");
        int attempts = sc.nextInt();
        Map<Integer,Integer> storeMap =new HashMap<>();

        //precomute
        for (int j : arr) {
            if (storeMap.containsKey(j)) {
                storeMap.put(j, storeMap.get(j) + 1);
            } else {
                storeMap.put(j, 1);
            }
        }
        while (attempts>0) {
            System.out.println("Enter an element to check occurances :");
            int element = sc.nextInt();
            int occurances = findOccurances(element, storeMap);
            System.out.println("Entered element occurs for :"+ occurances +" times");
            attempts--;
        }
    }

    private static int findOccurances(int element, Map<Integer, Integer> storeMap) {
        return storeMap.getOrDefault(element, 0);
    }
}
