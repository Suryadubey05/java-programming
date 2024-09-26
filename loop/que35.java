package loop;

import java.util.Scanner;

public class que35 {
    public static void main(String[] args) {
        int sum_odd = 0;
        int sum_even = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum_even += i;
            } else {
                sum_odd += i;
            }
        }
        System.out.println("sum of even num " + sum_even + "\n" + "sum of odd num " + sum_odd);
    }
}
