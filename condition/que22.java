package condition;

import java.util.Scanner;

public class que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 80 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 70 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 60 && marks <= 70) {
            System.out.println("BC");

        } else {
            System.out.println("madarchod padhai kar");
        }

    }
}
