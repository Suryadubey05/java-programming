package condition;

import java.util.Scanner;

public class que25_b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");     // 8888
        int amount = sc.nextInt();
        // left = 8888

        if (amount >= 2000) {                      // 8888>2000
            amount /= 2000;                     // 4
            System.out.println("2000 note :" + amount);
            amount %= 2000;// 888
            // amt = 888
        }
        if (amount >= 500) {                      // 8888>2000
            amount /= 500;                     // 4
            System.out.println("2000 note :" + amount);
            amount %= 500;
        }
        if (amount >= 100) {                      // 8888>2000
            amount /= 100;                     // 4
            System.out.println("2000 note :" + amount);
            amount %= 100;
        }
    }

}
