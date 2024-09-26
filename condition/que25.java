package condition;

import java.util.Scanner;

public class que25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount");     // 8888
        int amount = sc.nextInt();
        int left = amount;                    // left = 8888

        if (left >= 2000) {                      // 8888>2000
            amount /= 2000;                     // 4
            left %= 2000;                      // 888
            System.out.println("2000 note :" + amount);
            amount = left;                   // amt = 888
        }
        if (left >= 500) {                      //888>500
            amount /= 500;                     // 1
            left %= 500;                      // 388
            System.out.println("500 note :" + amount);
            amount = left;                  // amt = 388
        }
        if (left >= 200) {                      //388>200
            amount /= 200;                     // 1
            left %= 200;                      // 188
            System.out.println("200 note :" + amount);
            amount = left;                  // amt = 188
        }
        if (left >= 100) {                      //188>100
            amount /= 100;                     // 1
            left %= 100;                      // 88
            System.out.println("100 note :" + amount);
            amount = left;                  // amt = 88
        }
        if (left >= 50) {                      //88>50
            amount /= 50;                     // 1
            left %= 50;                      // 38
            System.out.println("50 note :" + amount);
            amount = left;                 // amt = 38
        }
        if (left >= 20) {                      //38>20
            amount /= 20;                     // 1
            left %= 20;                      // 18
            System.out.println("20 note :" + amount);
            amount = left;                 // amt = 18
        }
        if (left >= 10) {                      //18>10
            amount /= 10;                   // 1
            left %= 10;                     // 8
            System.out.println("10 note :" + amount);
            amount = left;                  // amt = 8
        }
        if (left >= 5) {                      //8>5
            amount /= 5;                   // 1
            left %= 5;                     // 3
            System.out.println("5 note :" + amount);
            amount = left;                  // amt = 3
        }
        if (left >= 2) {                      //3>2
            amount /= 2;                   // 1
            left %= 2;                     // 1
            System.out.println("2 note :" + amount);
            amount = left;                  // amt = 1
        }
        if (left >= 1) {                      //1>1
            amount /= 1;                   // 1
            left %= 1;                     // 0
            System.out.println("1 note :" + amount);
            amount = left;                  // amt =0
        }

    }
}

