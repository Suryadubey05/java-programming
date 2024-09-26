public class array {
    public static void main(String[] args) {
       //binary search
        int arr[]={2,6,13,67,99,567};
        int s=0;
        int e= arr.length-1;
        int key=13;
        int index=0;

        while (s<=e){
            int mid=s+(e-s)/2;
            if (key==arr[mid]){
                index=mid;
                break;

            }else if (key<arr[mid]){
                e=mid-1;
            }else if (key>arr[mid]){
                s=mid+1;
            }
        }
        System.out.println(index);

    }
}
