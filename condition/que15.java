package condition;

import java.util.Scanner;
public class que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age");
        int age = sc.nextInt();
        int valid_age = 18 -age;
        if(age >= 18){
            System.out.println("you are valid");
        } else if(age < 18) {
            System.out.println("you are not valid");
            System.out.println("you will be valid till "+ valid_age + "years");
        }else{
            System.out.println("invalid In");
        }
    }
}

