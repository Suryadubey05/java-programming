package array;

import java.util.Arrays;
                                                    //rotate shift left with O(n) time complexity
public class que82_b {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int temp[] = new int[arr.length];
        int k = 3;
        if (k >= arr.length) {
            k = k % arr.length;
        }
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            temp[j++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            temp[j++] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
