package do_while;

import java.util.Scanner;

public class que53_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any char");
        char ch = sc.nextLine().charAt(0);
        String res = switch (ch){                //switch as an expression
            case 'a','e','i','o','u' -> {
                System.out.println("heyyyyy");
               yield  "vowel";                   // yield for some statement more than one line
            }
            default -> "consonent";
        };
        System.out.println(res);

    }
}
