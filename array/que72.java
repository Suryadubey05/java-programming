package array;

import java.util.Scanner;

public class que72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i != n - 1)
                System.out.print(arr[i] + " + ");
            else
                System.out.print(arr[i]);
        }
        System.out.println(" = " + sum);
    }
}
