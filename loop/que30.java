package loop;

import java.util.Scanner;

public class que30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num = sc.nextInt();
        int i = 1;
        while (i<=num){
            System.out.println(i);
            i+=1;
        }
    }
}
