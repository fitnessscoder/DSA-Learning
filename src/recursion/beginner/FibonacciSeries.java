package recursion.beginner;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the required fibonacci number from series: ");
        int fibonum = sc.nextInt();
        System.out.println("The "+fibonum+"th Number is "+ fetchFiboNum(fibonum));
    }

    private static int fetchFiboNum(int fibonum) {
        if(fibonum <=1) return fibonum;
        return fetchFiboNum(fibonum-1) + fetchFiboNum(fibonum-2);
    }
}
