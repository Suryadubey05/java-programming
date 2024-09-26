package loop;

import java.util.Scanner;

public class que42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("enter num");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("it is prime num");
        }else {
            System.out.println("not prime");
        }
    }

}
