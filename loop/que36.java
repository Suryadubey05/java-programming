package loop;

import java.util.Scanner;

public class que36 {
    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                System.out.println(i);


            }
        }
    }
}
