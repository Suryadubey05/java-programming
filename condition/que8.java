package condition;

import java.util.Scanner;

public class que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp in fahrenheit");

        double f = sc.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("celsius:"+c);


    }
}
