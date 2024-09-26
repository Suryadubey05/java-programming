package patterns;

import java.util.Scanner;

public class que64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        for (int i=1; i<=row; i++){
            int spaces;
            for (spaces=1;spaces<=row-i; spaces++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=row-1; i>=1; i--){
            int spaces;
            for (spaces=1;spaces<=row-i; spaces++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
