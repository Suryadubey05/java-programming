package loop;

import java.util.Scanner;

public class que46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 //confusion
        System.out.println("enter any num");
        int num = sc.nextInt();
        int rem, temp, sum = 0;
        temp = num;
        while (num != 0) {
            rem = num % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum = sum + fact;
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("peterson/strong num");
        } else {
            System.out.println("not peterson/strong num");
        }
    }
}

