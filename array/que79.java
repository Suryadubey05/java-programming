package array;

import java.util.Arrays;

public class que79 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 4, 9};
        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
