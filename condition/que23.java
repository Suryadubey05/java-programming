package condition;

import java.util.Scanner;

public class que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float amount, dis_p, discount, disc_amount;
        System.out.println("enter your amount");

        amount = sc.nextFloat();

        if (amount <= 5000) {
            dis_p = 0;
        } else if (amount > 5000 && amount <= 7000) {
            dis_p = 10;
        } else if (amount > 7000 && amount <= 10000) {
            dis_p = 20;
        } else {
            dis_p = 30;
        }
        discount = amount * (dis_p / 100);
        disc_amount = amount - discount;
        System.out.println("amount after discount :" + disc_amount);

    }
}
