package condition;

import java.util.Scanner;

public class que21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        double year = sc.nextDouble();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            } else {
                System.out.println("not leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println(" leap year");
        } else {
            System.out.println("not leap year");
        }


    }
}
