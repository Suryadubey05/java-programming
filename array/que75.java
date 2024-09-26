package array;

public class que75 {
    public static void main(String[] args) {

        int arr[] = {34, 6, 67, 8, 444, 4, 234,2};
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                index=i;
                min = arr[i];
            }
        }
        System.out.println("min value is: "+min);
        System.out.println("and the index is: "+index);

    }
}