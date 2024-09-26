package patterns;

import java.util.Scanner;

public class que63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int row = sc.nextInt();
        for (int i=0; i<=row; i++){
            int spaces;
            for (spaces=1;spaces<=i; spaces++){
                System.out.print(" ");
            }
            for (int j=row-i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
