package array;

public class que87 {                                           //linear search
    public static void main(String[] args) {
        int arr[]={3,5,8,2,6,23,7,55};
        int key=8;
        int index=-1;

        for (int i =0; i<= arr.length-1; i++) {
            if (arr[i] == key) {
                index = i;
                break;

            }

        }
        System.out.println(index);
    }
}
