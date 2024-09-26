package array;

import java.util.Arrays;

public class que82 {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,5};
        int k =30002;
        if (k>= arr.length)
            k =k % arr.length;
        System.out.println(k); 

        for (int j = 1; j <= k; j++) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}