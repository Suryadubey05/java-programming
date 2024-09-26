package patterns;

import java.util.Scanner;

public class que62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        for (int i=1; i<=row; i++){
            for (int spaces=1;spaces<=row-i; spaces++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}