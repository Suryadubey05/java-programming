package loop;

import java.util.Scanner;

public class que42_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 1) {
            System.out.println("not prime ");
        } else if (num == 2) {
            System.out.println("prime");
        } else if (num % 2 == 0) {
            System.out.println("not prime");
        } else {
            for (int i = 3; i < Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime ? "not prime" : "prime");               //for 1067 ----> confusion
                                                                               // 1067=11*97
        }
    }
}
