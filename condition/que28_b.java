package condition;

import java.util.Scanner;

public class que28_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        a =a+b;
        b= a-b;                            // swap without third variable
        a =a-b;
        System.out.println("a:"+a+"\nb"+b);


    }
}
