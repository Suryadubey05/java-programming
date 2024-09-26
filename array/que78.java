package array;

import java.util.Arrays;

public class que78 {
    public static void main(String[] args) {
        int arr[] = {2,96,69,77,145,20};
        int temp[] = new int[arr.length];
        int k =0;
        for (int i=arr.length-1; i>=0; i--){
            temp[k]= arr[i];
            k++;
        }
        arr=temp;
        System.out.println(Arrays.toString(arr));

    }
}
