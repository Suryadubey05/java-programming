package array;

import java.util.Scanner;

public class que73 {
    public static void main(String[] args) {

        int arr[] = {12,3,6,7,23,9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("mean is: "+sum/ arr.length);
    }
}
