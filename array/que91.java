package array;
                                                              //[bubble sort]
import java.util.Arrays;

public class que91 {
    public static void main(String[] args) {
        int arr[]={1,6,3,9,6,10,2,56};
        for (int i =0; i< arr.length-1; i++){           //1,3,6,9,6,10,2,56
            for (int j=0; j< arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){              //1>6  6>3
                   int temp =arr[j];               //
                   arr[j]=arr[j+1];                //  6,3-> 3,6
                   arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
