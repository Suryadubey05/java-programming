package condition;

import java.util.Scanner;
public class que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter gender (M/F)");
        char gender = sc.nextLine().charAt(0);


        if(gender == 'm' || gender == 'M') {
            System.out.println("hello sir");
        } else if (gender == 'f' || gender == 'F') {
            System.out.println("hello ma'am");
        } else {
            System.out.println("wrong In");
        }
    }
}