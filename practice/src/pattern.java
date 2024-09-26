public class pattern {
    public static void main(String[] args) {
        int arr[]= {3,6,2,6,7,};
       for (int i=0;i<arr.length;i++){
           for (int j=0;j< arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("*");
               }
           }
       }
    }
}
