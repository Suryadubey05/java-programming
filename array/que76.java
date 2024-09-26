package array;

import java.util.Arrays;

public class que76 {
    public static void main(String[] args) {
        //find second greatest element

        int arr[] = {97, 96, 69,106, 77, 145, 20};
        int firstMax = Math.max(arr[0], arr[1]);
        int secondMax = Math.min(arr[0], arr[1]);
        for (int i=2;i< arr.length;i++){
            if (arr[i]>firstMax){
                secondMax=firstMax;
                firstMax=arr[i];
            } else if (arr[i]>secondMax) {
                secondMax=arr[i];

            }

        }System.out.println(secondMax);
    }
}
