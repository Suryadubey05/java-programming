package loop;

import java.util.Scanner;

public class que47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any num");
        int num = sc.nextInt();
        int value=0, sum =0,temp;
        temp=num;
        while (num!=0){
            value=num%10;
            sum+=value;
            num/=10;
        }
        if(temp%sum==0){
            System.out.println("it is harshad num");
        }else {
            System.out.println("not harshad num");
        }
    }
}

