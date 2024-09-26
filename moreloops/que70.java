package moreloops;

public class que70 {
    public static void main(String[] args) {
        int n = 10;
        int fib1 = -1, fib2 = 1, fib3 = 0;
        while (fib3 <= n) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
            System.out.println(fib3);
        }
    }
}
