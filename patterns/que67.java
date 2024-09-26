package patterns;

import java.util.Scanner;

public class que67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
            //spaces
            for (int j = 1; j <= num - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }

    }
}
