package array;

import java.util.Arrays;

public class que83 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 4, 9};
        int k = 3;

        for (int j = 1; j <= k; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }
}