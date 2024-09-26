package loop;

import java.util.Scanner;

public class que32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num for table");
        int num = sc.nextInt();

        int i = 1;
        while (i<=10){
            int b =num*i;
            System.out.println(num+"x"+i+"="+b);
            i+=1;
        }
    }
}
