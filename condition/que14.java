package condition;

import java.util.Scanner;
public class que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any Int num");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("it is even num");
        } else {
            System.out.println("it is odd num");
        }

    }
}

