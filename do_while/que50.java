package do_while;

import java.util.Scanner;

public class que50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option, a, b, c;
        int value;
        do {
            System.out.println("1-addition");
            System.out.println("2-subtraction");
            System.out.println("3-multiplication");
            System.out.println("4-division");
            System.out.println("choose any option for calculate");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println("addition is:" + c);

                }
                case 2 -> {
                    System.out.println("enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println("subtraction is:" + c);

                }
                case 3 -> {
                    System.out.println("enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println("multiplication is:" + c);

                }
                case 4 -> {
                    System.out.println("enter two numbers");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println("division is:" + c);

                }
                default -> System.out.println("wrong IN");
            }
            System.out.println("press 1 for repeat and 0 for stop");
            value = sc.nextInt();

        } while (value != 0);
    }
}
