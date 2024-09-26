package condition;

import java.util.Scanner;

public class que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, root1, root2, h, g;
        System.out.println("a:");
        a = sc.nextDouble();
        System.out.println("b:");
        b = sc.nextDouble();
        System.out.println("c:");
        c = sc.nextDouble();
        h = Math.abs(b * b - 4 * a * c);

        g = Math.sqrt(h);

        root1 = (-b + (g) / 2 * a);
        root2 = (-b - (g) / 2 * a);

        System.out.println("root1:"+root1 + "\nroot2:" + root2);


    }
}
