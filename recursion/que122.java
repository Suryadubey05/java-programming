package recursion;

public class que122 {
    public static void  naturalNo(int n){
        if (n==0){
            return;
        }
        naturalNo(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        naturalNo(5);
    }
}
