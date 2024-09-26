package do_while;

import java.util.Scanner;

public class que51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum_even = 0, sum_odd = 0, sum_neg = 0;
        do {
            System.out.println("enter num");
            num = sc.nextInt();
            if (num < 0) {
                sum_neg += num;
            } else if (num % 2 == 0) {
                sum_even += num;
            } else {
                sum_odd += num;
            }

        } while (num != 0);
        System.out.println("sum of negative num:" + sum_neg + "\nsum of even num:" + sum_even + "\nsum of odd num:" + sum_odd);
    }
}
