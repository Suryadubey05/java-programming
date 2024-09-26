package array;

public class que85 {
    public static void main(String[] args) {
        int arr[]={1,2,5,5,2,1};
        boolean ans = true;
        for (int i =0; i<= arr.length-1; i++){
            if (arr[i]==arr[arr.length-(i+1)]){
                ans =true;
            }
            else {
                ans = false;
            }
        }
        System.out.println(ans?"palindrome":"not palindrone");


    }
}
