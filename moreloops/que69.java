package moreloops;

import java.util.Scanner;

public class que69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = Math.max(num1, num2);
        int j=1;
        for (int i = ans; i <= num1*num2; i=ans* ++j) {
            if (i%num1 == 0 && i%num2 == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}