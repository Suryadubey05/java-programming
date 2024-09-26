package loop;

import java.util.Scanner;

public class que40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        int rem, rev = 0, rev2;
        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
            System.out.println(rev);
        }
        while (rev > 0) {
            rev2 = rev % 10;
            System.out.println(rev2);
            rev /= 10;
        }
    }
}