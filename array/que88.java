package array;
                                                     //     [binary search]
                                                     //binary search must be sorted.
public class que88 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 13, 15, 17, 19, 90};
        int key = 90;
        int index = -1;
        int s = 0;
        int e = arr.length-1;

        while (s <= e) {
            int mid = (s+e) / 2;
            if (key == arr[mid]) {
                index =mid;
                break;
            }
            if (key > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        System.out.println("key "+key+" found at index "+index);
    }
}
