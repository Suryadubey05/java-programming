package loop;

import java.util.Scanner;

public class que43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num");
        int num = sc.nextInt();
        int value=0;
        while (num!=0){
            value=num%10;
            num/=10;
            System.out.print(value);
        }
    }
}

