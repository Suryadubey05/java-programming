package do_while;

import java.util.Scanner;

public class que53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any char");
        char ch = sc.nextLine().charAt(0);
        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("consonent");
        }

    }
}
