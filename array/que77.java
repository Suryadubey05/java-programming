package array;

public class que77 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,10};
        boolean ans = true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                ans =false;
                break;
            }
        }
        System.out.println(ans);

    }
}
