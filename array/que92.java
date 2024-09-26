package array;

import java.util.Arrays;

public class que92 {
    public static void main(String[] args) {
        int arr[]={2,6,4,1,9,3,6,10,13};    //1,2,3,4,5,6,9,10,13
        Arrays.sort(arr);                   //it must for sort the element to median
        int median=0;
        int f;


       for (int i=0;i< arr.length; i++){
           if (arr.length%2==0){
               f= arr.length/2;
               median=(arr[f-1]+(arr[f]))/2;
               break;
           }else {
               f= arr.length/2;
               median=arr[f];
           }
       }
        System.out.println("median is: "+median);
    }
}
