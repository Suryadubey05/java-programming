package condition;

import java.util.Scanner;
public class que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num1");
        int a = sc.nextInt();
        System.out.println("num2");
        int b = sc.nextInt();
        System.out.println("num3");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("greatest num is  num 1 : " + a);
        } else if (b > a && b> c) {
            System.out.println("greatest num is : " + b);
        } else {
            System.out.println("greater num is : " + c );
        }

    }



}