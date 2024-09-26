package array;

import java.util.Arrays;
                                                         //confusion
public class que85_b {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1};
        int temp[]=new int[arr.length];
        int k =0;
        for (int i = arr.length-1 ;i>=0; i--){
            temp[k++]=arr[i];
        }
        if (temp==arr){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
