package array;

import java.util.Arrays;

public class que90 {
    public static void main(String[] args) {

        int arr[] = {-3, -6, 3, 8, 21, -56, 7, -19};
        int i = 0, j = arr.length - 1;

        while (i < j) {
            while (i < arr.length && arr[i] < 0) {
                i++;
            }
            while (j >= 0 && arr[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
