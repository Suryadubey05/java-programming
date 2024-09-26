package condition;

import java.util.Scanner;

public class que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side of triangle");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s= (a+b+c)/2;
        double area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);







    }
}
