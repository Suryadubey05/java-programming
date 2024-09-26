package loop;

import java.util.Scanner;

public class que48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num");
        int num = sc.nextInt();
        int  count = 0;
        int square = num * num;
        int temp = num;
        while (num > 0) {
            num /= 10;
            count++;
        }
        double lastdigit = (int) square % (Math.pow(10, count));
        if (temp == lastdigit) {
            System.out.println("it is automorphic num");
        } else {
            System.out.println("not automorphic num");
        }

    }
}

