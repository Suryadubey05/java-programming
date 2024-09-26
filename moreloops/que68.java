package moreloops;

import java.util.Scanner;
                                                                 //HCF=highest common factor
public class que68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = Math.min(num1, num2);
        for (int i = ans; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);

    }
}
