package do_while;

import java.util.Scanner;

public class que55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int option, price1 = 0, price2 = 0, price3 = 0, value;

        do {
            System.out.println("1.Indian dish" + "\n2.Italian dish" + "\n3.Russian dish");
            System.out.println("select any option");
            option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    do {
                        System.out.println("1.butter Paneer Mashala : 100rs" + "\n2.Dosa : 45rs" + "\n3.aloo chat : 25rs");
                        option = sc.nextInt();
                        switch (option) {
                            case 1 -> {
                                price1 = 100;
                            }
                            case 2 -> {
                                price2 = 45;
                            }
                            case 3 -> {
                                price3 = 25;
                            }
                            default -> System.out.println("wrong IN");
                        }
                        System.out.println("press 0 for repeat and 9 for total bill");
                        option = sc.nextInt();
                    } while (option == 0);
                    System.out.println("Total bill is:" + (price1 + price2 + price3) + "Rs only");
                }
                case 2 -> {
                    do {
                        System.out.println("1.pasta : 120rs" + "\n2.pizza : 200rs" + "\n3.macaroni : 67rs");
                        option = sc.nextInt();
                        switch (option) {
                            case 1 -> {
                                price1 = 120;
                            }
                            case 2 -> {
                                price2 = 200;
                            }
                            case 3 -> {
                                price3 = 67;
                            }
                            default -> System.out.println("wrong IN");
                        }
                        System.out.println("press 0 for repeat and 9 for total bill");
                        option = sc.nextInt();
                    } while (option == 0);
                    System.out.println("Total bill is:" + (price1 + price2 + price3) + "Rs only");
                }
                case 3 -> {
                    do {
                        System.out.println("1.Shchi : 150rs" + "\n2.Pirozhki : 55rs" + "\n3.special Russian dish(only for male customer) : 6000rs");
                        option = sc.nextInt();
                        switch (option) {
                            case 1 -> {
                                price1 = 150;
                            }
                            case 2 -> {
                                price2 = 55;
                            }
                            case 3 -> {
                                price3 = 6000;
                            }
                            default -> System.out.println("wrong IN");
                        }
                        System.out.println("press 0 for repeat and 9 for total bill");
                        option = sc.nextInt();
                    } while (option == 0);
                    System.out.println("Total bill is:" + (price1 + price2 + price3) + "Rs only");
                }
            }
            System.out.println("press 0 for Repeat");
            value = sc.nextInt();
        } while (value == 0);
    }
}
