package condition;

import java.util.Scanner;

public class que24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter unit");
        int unit= sc.nextInt();
        int amt= 0;
        if(unit>400){
            amt+=(unit-400)*13;
            unit= 400;
        }
        if (unit>200){
            amt+=(unit-200)*8;
            unit=200;
        }
        if (unit>100){
            amt+=(unit-100)*6;
            unit=100;
        }
        amt+=unit*4.2;
        System.out.println("amount is :"+amt);



    }
}
