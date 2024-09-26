package loop;

import java.util.Scanner;

public class que44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num");
        int num = sc.nextInt();
        int value, value2 = 0,temp;
        temp = num;

        while (num > 0) {
            value = num % 10;
            value2 = (value2 * 10) + value;
            num /= 10;
        }
        if (temp == value2) {
            System.out.println(value2 + ": palindrome num");
        }else {
            System.out.println(value2 + ": not a palindrome num");
        }
    }
}

