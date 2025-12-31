package hasing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapWay {
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

        Map<Integer, Integer> preCompute=new HashMap<>();
        for(int i : arr) {
            if(preCompute.containsKey(i)) {
                preCompute.put(i,preCompute.get(i)+1);
            } else {
                preCompute.put(i, 1);
            }
        }

        //Iterate on Map
        for(Map.Entry<Integer, Integer> entry : preCompute.entrySet()) {
            System.out.println(entry.getKey() +" " + entry.getValue());
        }


        //Fetching
        int sequence = sc.nextInt();
        while (sequence>0) {
            System.out.println("Enter a number to search :");
            int searchNum = sc.nextInt();
            System.out.println("The number "+searchNum +" occurred for "+preCompute.get(searchNum)+ " times");
            sequence--;
        }
    }
}
