package loop;

import java.util.Scanner;

public class que45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num");
        int num = sc.nextInt();
        double value,sum=0,cube,temp;
        temp = num;
        while (num>0){
            value=num%10;
            cube = Math.pow(value,3);
            sum+=cube;
            num/=10;
        }
       if (temp==sum){
           System.out.println("armstrong num");
       }else {
           System.out.println("not armstrong num");
       }
    }
}

