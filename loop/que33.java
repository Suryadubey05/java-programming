package loop;

import java.util.Scanner;

public class que33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans =0 ;
        System.out.println("enter num");
        int num = sc.nextInt();

        int i = 1;
        while (i<=num){
            ans = ans+i;
            i+=1;

        }
        System.out.println(ans);

    }
}
