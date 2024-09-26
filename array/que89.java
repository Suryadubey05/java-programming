package array;

import java.util.Arrays;

public class que89 {
    public static void main(String[] args) {
        int arr[] = {-2, 5, -3, 7, 9, -90, 6, -8, -10};
        int temp[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[k++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[k++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }

}
