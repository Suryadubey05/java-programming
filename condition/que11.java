package condition;

import java.util.Scanner;

public class que11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your a no.");
        double a = sc.nextDouble();
        System.out.println("enter your b no.");
        double b = sc.nextDouble();
        if (a>b){
            System.out.println("a is greater");

        }else{
            System.out.println("b is greater");
        }

    }
}
