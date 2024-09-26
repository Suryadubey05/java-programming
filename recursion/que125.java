package recursion;

public class que125 {
    public static int sod(int n) {
        if (n < 10)
            return n;
        return n % 10 + sod(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sod(123));
    }
}
