package condition;

import java.util.Scanner;

public class que28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
