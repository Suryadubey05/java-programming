package loop;

import java.util.Scanner;

public class que34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans= 1;
        System.out.println("enter num for factorial value");
        int num = sc.nextInt();
        for (int i = 1; i<=num; i++){
            ans = ans*i;
        }
        System.out.println(ans);

    }
}
