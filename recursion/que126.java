package recursion;

public class que126 {
    static int rev = 0;

    public static int rev(int n) {
        if (n == 0)
            return rev;
        int rem = n % 10;
        rev = rev * 10 + rem;
        rev(n / 10);
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(rev(1235637));
    }
}
