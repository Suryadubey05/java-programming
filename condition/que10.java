package condition;

import java.util.Scanner;

public class que10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your value");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a==b && b==c){
            System.out.println("all are equal");
        }else if(a==b||b==c||a==c){
            System.out.println("any two equal");
        }else{
            System.out.println("no any are equal");
        }


    }
}
