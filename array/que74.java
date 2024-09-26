package array;

public class que74 {
    public static void main(String[] args) {

        int arr[] = {34, 6, 67, 8, 444, 4, 234};
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                index=i;
                max = arr[i];
            }
        }
        System.out.println("max value is: "+max);
        System.out.println("and the index is: "+index);

    }
}