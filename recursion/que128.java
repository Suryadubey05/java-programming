package recursion;

public class que128 {
    public static int hcf(int a, int b){
        if (b==0)
            return a;
        if (a>b){
            return hcf(a-b,b);
        }else {
            return hcf(a,b-a);
        }
    }

    public static void main(String[] args) {
        System.out.println(hcf(98,56));
    }
}
