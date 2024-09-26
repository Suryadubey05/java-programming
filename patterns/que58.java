package patterns;

import java.util.Scanner;

public class que58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows in form of capital alphabate");
        char row = sc.nextLine().charAt(0);

        for (char i ='A'; i<=row; i++){
            for (char j='A'; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
