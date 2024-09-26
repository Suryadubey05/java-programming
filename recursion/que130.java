package recursion;

public class que130 {                            //confusion
    public static int binSearch(int arr[], int se, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == se)
                return mid;
            if (arr[mid] > se)
                return binSearch(arr, se, start, mid - 1);
            else
                return binSearch(arr, se, mid + 1, end);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = {34, 7, 12, 0, 54, 3, 21, 7, 9, 33, 71};
        System.out.println(binSearch(arr, 54, 0, arr.length - 1));
    }
}